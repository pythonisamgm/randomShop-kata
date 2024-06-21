package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Gourmet implements IProduct {
    private boolean isStinky;
    private Integer age;
    private final List<Object> products;

    public Gourmet(boolean isStinky, Integer age) {
        this.isStinky = isStinky;
        this.age = age;
        this.products = new ArrayList<>();
    }

@Override
    public BigDecimal calculateProductPrice() {
        if (this.isStinky()) {
            return BigDecimal.valueOf(10.0 * this.getAge());
        } else {
            return BigDecimal.valueOf(20.0 * this.getAge());
        }
    }

    @Override
    public BigDecimal getBasePrice() {
        return null;
    }

    public boolean isStinky() {
        return isStinky;
    }

    public void setStinky(boolean stinky) {
        isStinky = stinky;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
