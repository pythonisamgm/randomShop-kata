package org.example;

import java.math.BigDecimal;

public class MagicCards {
    private String color;
    private String name;
    private int age;

    public MagicCards(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public BigDecimal pricePerColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            if (getAge()>10){return BigDecimal.valueOf(3.5).multiply(BigDecimal.valueOf(0.5));}
            return BigDecimal.valueOf(3.5);
        } else if (color.equalsIgnoreCase("blue")) {
            if (getAge()>10){return BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(0.5));}
            return BigDecimal.valueOf(5.0);
        } else if (color.equalsIgnoreCase("green")) {
            if (getAge()>20){return BigDecimal.valueOf(4.40).multiply(BigDecimal.valueOf(1.2));}
                return BigDecimal.valueOf(4.40);
            } else if (color.equalsIgnoreCase("black")) {
            if (getAge()>20){return BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(1.2));}
                return BigDecimal.valueOf(6.80);
            } else if (color.equalsIgnoreCase("brown")) {
                return BigDecimal.valueOf(2.0);
            }else
            {return BigDecimal.valueOf(0.0);
            }
        }
    public BigDecimal totalPrice(){
        return pricePerColor(color);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
