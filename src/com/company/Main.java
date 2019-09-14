package com.company;

public class Main {

    public static void main(String[] args) {

        Dimension dimensionRoomFirst = new Dimension(5,5,3);
        Radio radioFirstRoom = new Radio("Grundig", "Bou 150", 230);
        Computer computerFirstRoom =new Computer("Dell", "1500", 230);
        Amplifier amplifierFirstRoom = new Amplifier("Technica", "103",230);

        RTV rtvRoomFirst = new RTV(radioFirstRoom, computerFirstRoom, amplifierFirstRoom);

	    Room roomFirst = new Room(dimensionRoomFirst,"white",5,rtvRoomFirst,2);

	    roomFirst.dimensionOfTheRoom();
	    roomFirst.getRtv().getAmplifier().powerOn();
    }
}
