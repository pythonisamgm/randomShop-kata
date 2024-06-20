package org.example;

public class Pets {
    private int numberOfLegs;
    private String color;
    private boolean isStinky;

    public Pets(int numberOfLegs, String color, boolean isStinky) {
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.isStinky = isStinky;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStinky() {
        return isStinky;
    }

    public void setStinky(boolean stinky) {
        isStinky = stinky;
    }
}
