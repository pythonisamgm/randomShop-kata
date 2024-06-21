package org.example;
import java.math.BigDecimal;

public class Fish implements IProduct {
 private String color;
 private BigDecimal basePrice;
    public Fish(String color, BigDecimal basePrice) {
        this.color=color;
        this.basePrice=basePrice;

    }


    /*public BigDecimal pricePerColor(String color) {
        if (color.equalsIgnoreCase("blue") && this.basePrice != null) {
            return BigDecimal.valueOf(0.1);
        } else if (color.equalsIgnoreCase("gold") && this.basePrice != null) {
            return BigDecimal.valueOf(100.0);
        } else{
            return BigDecimal.valueOf(0);
        }

    }*/
    @Override
    public BigDecimal calculateProductPrice() {
        if (color.equalsIgnoreCase("blue") && basePrice != null) {
            return BigDecimal.valueOf(0.1).add(getBasePrice());
        } else if (getColor().equalsIgnoreCase("gold") && this.getBasePrice() != null) {
            return BigDecimal.valueOf(100.0).multiply(getBasePrice());
        } else{
            return BigDecimal.valueOf(0);
        }

    }


    @Override
    public BigDecimal getBasePrice() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public BigDecimal getNumberOfLegs() {
        return null;
    }

    @Override
    public String getColor() {
        return "";
    }

    @Override
    public boolean isStinky() {
        return false;
    }

    @Override
    public Integer getAge() {
        return 0;
    }
}

