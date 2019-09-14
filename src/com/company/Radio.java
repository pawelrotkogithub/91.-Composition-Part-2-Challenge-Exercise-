package com.company;

public class Radio {

    private  String name;
    private  String model;
    private int power;

    public Radio(String name, String model, int power) {
        this.name = name;
        this.model = model;
        this.power = power;
    }


    public void powerOn(){
        System.out.println("Radio is on");
    }

    public void powerOff(){
        System.out.println("Radio is off");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }
}
