package org.example;

import java.math.BigDecimal;

public class Spider extends Pets {
    private BigDecimal spiderPrice;

    public Spider(BigDecimal numberOfLegs, String color, boolean isStinky, boolean redColor, String blue) {
        super(numberOfLegs, color, isStinky);

    }

    @Override
    public BigDecimal pricePerLeg() {
        return getNumberOfLegs().multiply(BigDecimal.valueOf(1.2));
    }


    public BigDecimal priceStinkySpider() {
        if (this.isStinky()) {
            return totalPrice().multiply(BigDecimal.valueOf(0.5));
        }
        return totalPrice().multiply(BigDecimal.valueOf(0));

    }

    public BigDecimal totalPrice() {
        return pricePerColor(getColor()).add(pricePerLeg());
    }

}
