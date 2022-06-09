package com.company;

public class Main <className>{

    public static void main(String[] args) {
        Printable[] printables = {createObject("Iphone"), createObject("Samsung"), createObject("OnePlus")};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }


    }

    public static Printable createObject(String className){
        switch (className) {
            case "Iphone":
                Iphone iphone = new Iphone(2020, "Iphone 10", "OLED", 164);
                return (iphone);
            case "Samsung":
                Samsung samsung = new Samsung(2019, "Galaxy s10", 512, 14);
                return (samsung);
            case "OnePlus":
                OnePlus onePlus = new OnePlus(2020, "OnePlus 8", "OxygenOS", 90);
                return (onePlus);
        }
        return null;
    }




}
