package org.example;

import java.math.BigDecimal;

public class MagicCards implements IProduct {
    private String color;
    private String name;
    private Integer age;

    public MagicCards(String color, String name, Integer age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public BigDecimal pricePerColor() {
        if(color.equalsIgnoreCase("red")) {
            if (getAge() > 10) {
                return BigDecimal.valueOf(3.5).multiply(BigDecimal.valueOf(0.5));
            }
            return BigDecimal.valueOf(3.5);
        } else if (color.equalsIgnoreCase("blue")) {
            if (getAge() > 10) {
                return BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(0.5));
            }
            return BigDecimal.valueOf(5.0);
        } else if (color.equalsIgnoreCase("green")) {
            if (getAge() > 20) {
                return BigDecimal.valueOf(4.40).multiply(BigDecimal.valueOf(1.2));
            }
            return BigDecimal.valueOf(4.40);
        } else if (color.equalsIgnoreCase("black")) {
            if (getAge() > 20) {
                return BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(1.2));
            }
            return BigDecimal.valueOf(6.80);
        } else if (color.equalsIgnoreCase("brown")) {
            return BigDecimal.valueOf(2.0);
        } else {
            return BigDecimal.valueOf(0.0);
        }
    }

    @Override
    public BigDecimal calculateProductPrice() {
       if (this.getName() == null){
           return pricePerColor();
       }
       else if (this.getName().equalsIgnoreCase("blackLotus")){
           return BigDecimal.valueOf(40000);
        }

        else {return pricePerColor();}
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public BigDecimal getNumberOfLegs() {
        return null;
    }

    @Override
    public boolean isStinky() {
        return false;
    }
}
