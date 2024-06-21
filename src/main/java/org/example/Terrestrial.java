package org.example;

import java.math.BigDecimal;

public class Terrestrial implements IProduct {
    private BigDecimal numberOfLegs;
    private String color;
    private boolean isStinky;
    private String name;

    public Terrestrial(BigDecimal numberOfLegs, String color, boolean isStinky, String name) {
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.isStinky = isStinky;
        this.name = name;
    }


    public BigDecimal pricePerLeg() {
        if (this.name.equals("spider")){
            return getNumberOfLegs().multiply(BigDecimal.valueOf(1.2));
        }else{
            return getNumberOfLegs().multiply(BigDecimal.valueOf(4.2));}
    }

    public BigDecimal pricePerColor() {
        if (getColor().equalsIgnoreCase("red")) {
            return BigDecimal.valueOf(2.0);
        } else if (getColor().equalsIgnoreCase("gold")) {
            return BigDecimal.valueOf(3.0);
        } else {
            return BigDecimal.valueOf(0.0);
        }
    }
    @Override
    public BigDecimal calculateProductPrice() {
        if (this.isStinky()){
            return (pricePerColor().add(pricePerLeg())).multiply(BigDecimal.valueOf(0.5));
        }else{
        return (pricePerColor().add(pricePerLeg())).multiply(BigDecimal.valueOf(0));}
    }

    @Override
    public BigDecimal getBasePrice() {
        return null;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return 0;
    }
}
