package com.company;

public class OnePlus extends Phone{

    private String androidVersion;
    private int fps;

    public OnePlus(int year, String model, String androidVersion, int fps) {
        super(year, model);
        this.androidVersion = androidVersion;
        this.fps = fps;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public int getFps() {
        return fps;
    }

    @Override
    public void print() {
        System.out.println("Year: " + getYear() + "| Model: " + getModel()
                + " | Android Version: " + getAndroidVersion() + " | FPS: " + getFps());
    }
}
