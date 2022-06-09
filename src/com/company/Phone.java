package com.company;

public abstract class Phone implements Printable{
    private int year;
    private String model;

    public Phone(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}
