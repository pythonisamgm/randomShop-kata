package org.example;

import java.math.BigDecimal;

public abstract class Pets {
    private BigDecimal numberOfLegs;
    private String color;
    private boolean isStinky;

    public Pets(BigDecimal numberOfLegs, String color, boolean isStinky) {
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.isStinky = isStinky;
    }


    public BigDecimal pricePerLeg() {
        return numberOfLegs.multiply(BigDecimal.valueOf(4.2));
    }

    public BigDecimal pricePerColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            return BigDecimal.valueOf(2.0);
        } else if (color.equalsIgnoreCase("gold")) {
            return BigDecimal.valueOf(3.0);
        } else {
            return BigDecimal.valueOf(0.0);
        }
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

    public BigDecimal getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(BigDecimal numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

}
