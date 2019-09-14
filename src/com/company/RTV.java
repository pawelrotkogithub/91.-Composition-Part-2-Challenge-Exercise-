package com.company;

public class RTV {

    private Radio radio;
    private Computer computer;
    private Amplifier amplifier;

    public RTV(Radio radio, Computer computer, Amplifier amplifier) {
        this.radio = radio;
        this.computer = computer;
        this.amplifier = amplifier;
    }

    public Radio getRadio() {
        return radio;
    }

    public Computer getComputer() {
        return computer;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }
}
