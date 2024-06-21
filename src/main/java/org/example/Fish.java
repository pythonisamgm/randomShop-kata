package org.example;
import org.example.Product;
import java.math.BigDecimal;

public class Fish extends Pets{

    public Fish(BigDecimal numberOfLegs, String color, boolean isStinky) {
        super(numberOfLegs, color, isStinky);
        this.setNumberOfLegs(BigDecimal.valueOf(0));
        this.setStinky(false);
    }

    @Override
    public BigDecimal pricePerColor(String color) {
        if (color.equalsIgnoreCase("blue")) {
            return BigDecimal.valueOf(0.1);
        } else if (color.equalsIgnoreCase("gold")) {
            return BigDecimal.valueOf(100.0);
        } else{
            return BigDecimal.valueOf(0);
        }

    }
    }

