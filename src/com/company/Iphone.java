package com.company;

public class Iphone extends Phone{
    private String screen;
    private int weight;

    public Iphone(int year, String model, String screen, int weight) {
        super(year, model);
        this.screen = screen;
        this.weight = weight;
    }

    public String getScreen() {
        return screen;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Year: " + getYear() + "| Model: " + getModel()
                + " | Screen: " + getScreen() + " | Weight: " + getWeight());
    }
}
