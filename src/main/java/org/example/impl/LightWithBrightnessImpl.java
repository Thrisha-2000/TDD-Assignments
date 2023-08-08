package org.example.impl;

import org.example.Light;

public class LightWithBrightnessImpl extends Light {
    public LightWithBrightnessImpl() {
        super();
    }

    @Override
    public void toggle() {

    }

    public void turnOn() {
        int currentBrightness = this.getBrightness();
        this.setBrightness(currentBrightness + 1);
    }

    public void turnOff() {

    }
}
