package org.example;

import java.math.BigDecimal;

public class Terrestrial extends Pets {
    public Terrestrial(BigDecimal numberOfLegs, String color, boolean isStinky) {
        super(numberOfLegs, color, isStinky);

        this.setStinky(false);
        this.setColor("");


    }
}
