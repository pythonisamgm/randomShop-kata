package org.example;

import java.math.BigDecimal;

public class Gourmet {
    private boolean isStinky;
    private int age;

    public Gourmet(boolean isStinky, int age) {
        this.isStinky = isStinky;
        this.age = age;
    }

    public BigDecimal stinkyCheesePrice(Product product) {
        return BigDecimal.valueOf(10.0 * product.getAge());
    }

    public BigDecimal totalPrice(boolean isStinky) {
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
}
