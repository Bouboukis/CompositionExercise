package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(225, 0);

        Bed bed = new Bed("Old Fashioned", 2, 60, 2, 1);

        Lamp lamp = new Lamp("Metallic crap.", false, 40);

        Bedroom bedRoom = new Bedroom("Georgios old roomw", wall1, wall2, wall3, wall4, ceiling, bed, lamp);


        bedRoom.getLamp().turnOn();
    }
}
