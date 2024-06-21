package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.example.Fish;
import org.example.Pets;
import org.example.Terrestrial;
import org.example.Spider;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        return products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    public BigDecimal spiderPrice(Product product) {

            BigDecimal price = BigDecimal.valueOf(1.2).multiply(BigDecimal.valueOf(product.getNumberOfLegs()));
            if (product.isStinky()) {
                price = price.multiply(BigDecimal.valueOf(0.5));
            }
            if ("red".equalsIgnoreCase(product.getColor())) {
                price = price.add(BigDecimal.valueOf(2.0));
            } else if ("gold".equalsIgnoreCase(product.getColor())) {
                price = price.add(BigDecimal.valueOf(3.0));
            }
            return price;

    }

    public BigDecimal animalPrice(Product product) {
        return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
    }

    public BigDecimal stinkyCheesePrice(Product product) {
        return BigDecimal.valueOf(10.0 * product.getAge());
    }

    public BigDecimal gourmetPrice(Product product) {
        if (product.isStinky()) {
            return stinkyCheesePrice(product);
        } else {
            return BigDecimal.valueOf(20.0 * product.getAge());
        }
    }


    public BigDecimal fishPrice(Product product) {
        return switch (product.getColor()) {
            case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
            case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
            default -> product.getBasePrice();
        };
    }

    public BigDecimal redMagicPrice(Product product) {
        Integer age = product.getAge(); // Retrieve age
        if (age != null && age > 10) {
            return BigDecimal.valueOf(3.5).multiply(BigDecimal.valueOf(0.5));
        } else {
            return BigDecimal.valueOf(3.5);

        }
    }

    public BigDecimal blueMagicPrice(Product product) {
        Integer age = product.getAge(); // Retrieve age
        if (age != null && age > 10) {
            return BigDecimal.valueOf(5.0).multiply(BigDecimal.valueOf(0.5));
        } else {
            return BigDecimal.valueOf(5.0);
        }
    }

    public BigDecimal greenMagicPrice(Product product) {
        Integer age = product.getAge(); // Retrieve age
        if (age != null && age > 20) {
            return BigDecimal.valueOf(4.40).multiply(BigDecimal.valueOf(1.2));
        } else {
            return BigDecimal.valueOf(4.40);
        }
    }

    public BigDecimal blackMagicPrice(Product product) {
        Integer age = product.getAge(); // Retrieve age
        if (age != null && age > 20) {
            return BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(1.2));
        } else {
            return BigDecimal.valueOf(6.80);
        }
    }

    public BigDecimal coloredMagicPrice(Product product) {

        return switch (product.getColor()) {
            case "red" -> {
                yield redMagicPrice(product);
            }
            case "blue" -> {

                yield blueMagicPrice(product);
            }
            case "green" -> {
                yield greenMagicPrice(product);
            }
            case "black" -> {
                yield blackMagicPrice(product);
            }
            case "brown" -> BigDecimal.valueOf(2.0);
            default -> BigDecimal.valueOf(2.0);
        };
    }



    private BigDecimal calculatePrice(Product product) {
        if (product.getNumberOfLegs() != null && product.isSpider()) {
            return spiderPrice(product);
        } else if (product.getNumberOfLegs() != null) {
            return animalPrice(product);
        } else if (product.getAge() != null && product.getColor() == null) {
            return gourmetPrice(product);
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            return fishPrice(product);
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            return coloredMagicPrice(product);
        }
        return product.getSellPrice();
    }
}


