package org.example.impl;

import org.example.Coordinates;
import org.example.Light;
import org.example.LightGrid;

public class LightGridWithBrightnessImpl extends LightGrid {
    public LightGridWithBrightnessImpl() {
        super(1000,1000);
    }

    @Override
    public void toggleGrid(Coordinates c1, Coordinates c2) {

    }

    @Override
    public void turnOffGrid(Coordinates c1, Coordinates c2) {

    }

    @Override
    public void turnOnGrid(Coordinates c1, Coordinates c2) {

    }

    @Override
    public int countLitLights() {
        return 0;
    }
}
