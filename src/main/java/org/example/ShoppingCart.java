package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.example.Terrestrial;
import org.example.Fish;
import org.example.Gourmet;
import org.example.MagicCards;

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

    public void addSampleProducts(){
    Gourmet wine = new Gourmet(false, 10);
    Gourmet cheese = new Gourmet(true, 10);

    MagicCards redMagic = new MagicCards("red", null, 9);
    MagicCards blueMagic = new MagicCards("blue", null, 9);
    MagicCards greenMagic = new MagicCards("green", null, 9);
    MagicCards blackMagic = new MagicCards("black", null, 9);
    MagicCards redOldMagic = new MagicCards("red", null, 11);
    MagicCards blueOldMagic = new MagicCards("blue", null, 11);
    MagicCards greenOldMagic = new MagicCards("green", null, 21);
    MagicCards blackOldMagic = new MagicCards("black", null, 21);
    MagicCards blackLotus = new MagicCards(null, "blackLotus", null);
    //blackLotus old

    Terrestrial animal = new Terrestrial((BigDecimal.valueOf(3)), null, false, null);
    Terrestrial spider = new Terrestrial((BigDecimal.valueOf(6)), null, false, "spider");
    Terrestrial spiderRed = new Terrestrial((BigDecimal.valueOf(6)), "red", false, "spider");
    Terrestrial spiderGold = new Terrestrial((BigDecimal.valueOf(6)), "gold", false, "spider");
    Terrestrial spiderStinky = new Terrestrial((BigDecimal.valueOf(6)), null, true, "spider");
    Terrestrial spiderRedStinky = new Terrestrial((BigDecimal.valueOf(6)), "red", true, "spider");
    Terrestrial spiderGoldStinky = new Terrestrial((BigDecimal.valueOf(6)), "gold", true, "spider");

    Fish blueFish = new Fish("blue", (BigDecimal.valueOf(0)));
    Fish goldFish = new Fish("gold", (BigDecimal.valueOf(1)));
    Fish fish = new Fish(null, (BigDecimal.valueOf(0)));

        products.add(wine);
        products.add(cheese);
        products.add(redMagic);
        products.add(redOldMagic);
        products.add(blueMagic);
        products.add(blueOldMagic);
        products.add(greenMagic);
        products.add(greenOldMagic);
        products.add(blackMagic);
        products.add(blackOldMagic);
        products.add(animal);
        products.add(spider);
        products.add(spiderGold);
        products.add(spiderStinky);
        products.add(spiderRedStinky);
        products.add(spiderGoldStinky);
        products.add(spiderRed);
        products.add(blueFish);
        products.add(goldFish);
        products.add(fish);

    }





/*
    public BigDecimal spiderPrice(Product product) {

            BigDecimal price = BigDecimal.valueOf(1.2).multiply(BigDecimal.valueOf(product.getNumberOfLegs()));
            if ((product.isStinky())) {
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
    }*/

/*
    private BigDecimal calculatePrice(IProduct product) {
        if (product.getNumberOfLegs() != null && product.getName().equalsIgnoreCase("spider")) {
            addSpider();
            return spider.calculateProductPrice();
        } else if (product.getNumberOfLegs() != null) {
            return product.calculateProductPrice();
        } else if (product.getAge() != null && product.getColor() == null) {
            return product.calculateProductPrice();
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            return product.calculateProductPrice();
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            return product.calculateProductPrice();
        }*/
    //return product.getSellPrice();
}



