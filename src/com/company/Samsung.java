package com.company;

public class Samsung extends Phone{

    private int memoryCardStorage;
    private int screenSize;

    public Samsung(int year, String model, int memoryCardStorage, int screenSize) {
        super(year, model);
        this.memoryCardStorage = memoryCardStorage;
        this.screenSize = screenSize;
    }

    public int getMemoryCardStorage() {
        return memoryCardStorage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public void print() {
        System.out.println("Year: " + getYear() + "| Model: " + getModel()
                + " | Memory Card size: " + getMemoryCardStorage() + " | Screen Size: " + getScreenSize());
    }
}
