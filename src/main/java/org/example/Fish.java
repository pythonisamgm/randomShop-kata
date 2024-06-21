package org.example;
import java.math.BigDecimal;

public class Fish {
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
    public BigDecimal totalPrice() {
        return pricePerColor(color);
    }
}

