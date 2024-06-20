package org.example;

public class Fish extends Pets{

    public Fish(int numberOfLegs, String color, boolean isStinky) {
        super(numberOfLegs, color, isStinky);
        this.setNumberOfLegs(0);
        this.setStinky(false);
    }
}
