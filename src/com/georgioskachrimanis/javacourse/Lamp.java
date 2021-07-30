package com.georgioskachrimanis.javacourse;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    // Constructors
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // Getter and Setter
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    // Methods
    public void turnOn() {
        System.out.println("The lamp is turned on.");
    }
}
