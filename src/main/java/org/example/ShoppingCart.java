package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    private BigDecimal calculatePrice(Product product) {
        if (product.getNumberOfLegs() != null) {
            return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
        }

        //quitar lo de los colores. Editar lo de que si tiene edad. Que ponga otra cosa...

        else if (product.getAge() != null &&
                product.getColor() == null){
              if (product.isStinky()) {
                return BigDecimal.valueOf(10.0 * product.getAge());
            } else {
                return BigDecimal.valueOf(20.0 * product.getAge());
            }
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            return switch (product.getColor()) {
                case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
                case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
                default -> product.getBasePrice();
            };
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            if ("red".equals(product.getColor())) {
                Integer age = product.getAge(); // Retrieve age
                if (age != null && age > 10) {
                    return BigDecimal.valueOf(3.5).multiply(BigDecimal.valueOf(0.5));
                } else {
                    return BigDecimal.valueOf(3.5);
                }
            } else if ("blue".equals(product.getColor())) {
                Integer age = product.getAge(); // Retrieve age
                if (age != null && age > 10) {
                    return BigDecimal.valueOf(5.0).multiply(BigDecimal.valueOf(0.5));
                } else {
                    return BigDecimal.valueOf(5.0);
                }
            }
            else if ("green".equals(product.getColor())) {
                Integer age = product.getAge(); // Retrieve age
                if (age != null && age > 10) {
                    return BigDecimal.valueOf(4.40).multiply(BigDecimal.valueOf(1.2));
                } else {
                    return BigDecimal.valueOf(4.40);
                }
            }else if ("black".equals(product.getColor())) {
                Integer age = product.getAge(); // Retrieve age
                if (age != null && age > 10) {
                    return BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(1.2));
                } else {
                    return BigDecimal.valueOf(6.80);
                }
            }
            else {
                return switch (product.getColor()) {
                    case "brown" -> BigDecimal.valueOf(2.0);


                    default -> BigDecimal.valueOf(2.0);
                };
            }
        } else {
            return product.getSellPrice();

        }
    }
}

