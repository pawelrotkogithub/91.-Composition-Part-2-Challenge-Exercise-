package com.company;

public class Dimension {

    private int length;
    private int hight;
    private int width;
    private int volume;

    public Dimension(int length, int hight, int width) {
        this.length = length;
        this.hight = hight;
        this.width = width;
        this.volume = length*hight*width;
    }



    public void capacity(){

        System.out.println("Capacity of the room is "+volume+" m3");
    }


    public int getLength() {
        return length;
    }

    public int getHight() {
        return hight;
    }

    public int getWidth() {
        return width;
    }

    public int getVolume() {
        return volume;
    }
}
