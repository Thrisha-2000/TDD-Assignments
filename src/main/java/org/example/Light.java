package org.example;

public abstract class Light {
    private boolean turnedOn;

    private int brightness;

    public abstract void toggle();

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public Light() {
        this.turnedOn = false;
        this.brightness = 0;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
}
