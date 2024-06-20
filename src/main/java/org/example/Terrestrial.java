package org.example;

public class Terrestrial extends Pets{
    public Terrestrial(int numberOfLegs, String color, boolean isStinky) {
        super(numberOfLegs, color, isStinky);
        this.setStinky(false);
        this.setColor("");
    }
}
