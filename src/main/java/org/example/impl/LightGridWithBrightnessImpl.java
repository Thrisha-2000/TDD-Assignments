package org.example.impl;

import org.example.Coordinates;
import org.example.Light;
import org.example.LightGrid;

public class LightGridWithBrightnessImpl extends LightGrid {
    public LightGridWithBrightnessImpl() {
        super(1000,1000, true);
    }

    @Override
    public void toggleGrid(Coordinates c1, Coordinates c2) {
        for (int i = c1.getRow(); i <=c2.getRow() ; i++) {
            for (int j = c1.getCol(); j <= c2.getCol(); j++) {
                int currentBrightness = this.getLights()[i][j].getBrightness();
                this.getLights()[i][j].setBrightness(currentBrightness + 2);
            }
        }
    }

    @Override
    public void turnOffGrid(Coordinates c1, Coordinates c2) {
        for (int i = c1.getRow(); i <=c2.getRow() ; i++) {
            for (int j = c1.getCol(); j <= c2.getCol(); j++) {
                int currentBrightness = this.getLights()[i][j].getBrightness();
                if (currentBrightness != 0){
                    this.getLights()[i][j].setBrightness(currentBrightness - 1);
                }
            }
        }
    }

    @Override
    public void turnOnGrid(Coordinates c1, Coordinates c2) {
        for (int i = c1.getRow(); i <=c2.getRow() ; i++) {
            for (int j = c1.getCol(); j <= c2.getCol(); j++) {
                int currentBrightness = this.getLights()[i][j].getBrightness();
                this.getLights()[i][j].setBrightness(currentBrightness + 1);
            }
        }
    }

    @Override
    public int countLitLights() {
        int count = 0;

        for (int i = 0; i < this.getMaxRows(); i++) {
            for (int j = 0; j < this.getMaxCols(); j++) {
                    count += this.getLights()[i][j].getBrightness();
            }
        }
        return count;
    }
}
