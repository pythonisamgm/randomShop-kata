package org.example;
import java.math.BigDecimal;

public class Fish implements IProduct {
 private String color;
    public Fish(String color) {
        this.color=color;
    }


    public BigDecimal pricePerColor(String color) {
        if (color.equalsIgnoreCase("blue")) {
            return BigDecimal.valueOf(0.1);
        } else if (color.equalsIgnoreCase("gold")) {
            return BigDecimal.valueOf(100.0);
        } else{
            return BigDecimal.valueOf(0);
        }

    }
    @Override
    public BigDecimal calculateProductPrice() {
        return pricePerColor(color);
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
    public int getAge() {
        return 0;
    }
}

