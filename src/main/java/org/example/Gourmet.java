package org.example;

import java.math.BigDecimal;

public class Gourmet implements IProduct {
    private boolean isStinky;
    private int age;

    public Gourmet() {
        this.isStinky = isStinky;
        this.age = age;
    }

@Override
    public BigDecimal calculateProductPrice() {
        if (this.isStinky()) {
            return BigDecimal.valueOf(10.0 * this.getAge());
        } else {
            return BigDecimal.valueOf(20.0 * this.getAge());
        }
    }

    public boolean isStinky() {
        return isStinky;
    }

    public void setStinky(boolean stinky) {
        isStinky = stinky;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
