package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {

    private final List<IProduct> products = new ArrayList<>();

    public void addProduct(IProduct product) {
        products.add(product);
    }

    public double getTotalPrice() {
        return products.stream()
                .map(IProduct::calculateProductPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

}



