package com.company;

public class Room {

    private Dimension dimension;
    private String colour;
    private int furniture;
    private RTV rtv;
    private int plants;

    public Room(Dimension dimension, String colour, int furniture, RTV rtv, int plants) {
        this.dimension = dimension;
        this.colour = colour;
        this.furniture = furniture;
        this.rtv = rtv;
        this.plants = plants;
    }

    public void dimensionOfTheRoom(){
        dimension.capacity();
    }


    public String getColour() {
        return colour;
    }

    public int getFurniture() {
        return furniture;
    }

    public RTV getRtv() {
        return rtv;
    }

    public int getPlants() {
        return plants;
    }
}
