package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void if_magic_card_is_red_return_3point5() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new MagicCards("red", null, 9);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }
    @Test
    void if_magic_card_is_red_and_over_10_years_multiply_by_0point5() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new MagicCards("red", null, 11);

        shoppingCart.addProduct(product);
        BigDecimal price = BigDecimal.valueOf(3.5).multiply(BigDecimal.valueOf(0.5));
        assertEquals( shoppingCart.getTotalPrice(), 1.75 );

    }

    @Test
    void if_magic_card_is_blue_return_5() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new MagicCards("blue", null, 9);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }
//
    @Test
    void if_magic_card_is_blue_and_over_ten_years_old_multiply_by_0point5(){
        ShoppingCart shoppingCart = new ShoppingCart();
        IProduct product = new MagicCards("blue", null, 11);

        shoppingCart.addProduct(product);
        BigDecimal price = BigDecimal.valueOf(5.0).multiply(BigDecimal.valueOf(0.5));
        assertEquals( shoppingCart.getTotalPrice(), 2.5);
    }
    @Test
    void if_magic_card_is_green_return_4point4() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new MagicCards("green", null, 9);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.4);

    }
    @Test
    void if_magic_card_is_green_and_over_twenty_years_old_multiply_by_1point2(){
        ShoppingCart shoppingCart = new ShoppingCart();
        IProduct product = new MagicCards("green", null, 21);

        shoppingCart.addProduct(product);
        assertEquals( shoppingCart.getTotalPrice(), 5.28 );
    }
    @Test
    void if_magic_card_is_black_return_6point8() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new MagicCards("black", null, 9);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.8);

    }
    @Test
    void if_magic_card_is_black_and_over_twenty_years_old_multiply_by_1point2(){
        ShoppingCart shoppingCart = new ShoppingCart();
        IProduct product = new MagicCards("black", null, 21);

        shoppingCart.addProduct(product);
        BigDecimal price = BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(1.2));
        assertEquals( price.doubleValue(), shoppingCart.getTotalPrice());
    }
    @Test
    void if_magic_card_is_brown_return_2() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new MagicCards("brown", null, 21);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2);

    }
    //@Test
    //void if_magic_card_is_blackLotus_return_40000() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
    //    Product product = new Product(null, null, false, "", null, "Magic: The Gathering - Black Lotus", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 40000);
//
    //}
//
    @Test
    void if_product_is_wine_multiply_number_of_years_per_20() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new Gourmet(false, 11);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 220.0);

    }
//
    @Test
    void if_product_is_stinky_cheese_multiply_number_of_years_per_10() {
        ShoppingCart shoppingCart = new ShoppingCart();

        IProduct product = new Gourmet(true, 11);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 110.0);

    }

    @Test
    void if_product_is_blue_fish_add_0point1_to_basePrice() {
        ShoppingCart shoppingCart = new ShoppingCart();
        BigDecimal zero = new BigDecimal(0);

        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), "", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 0.1);

    }
    ////set basePrice to 1
    //@Test
    //void if_product_is_golden_fish_multiply_100_for_basePrice() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
    //    BigDecimal one = new BigDecimal(1);
//
    //    Product product = new Product(null, null, false, "gold", one, "", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 100.0);
//
    //}
    //@Test
    //void if_product_is_regular_fish_get_basePrice() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
    //    BigDecimal one = BigDecimal.valueOf(1.0);
    //    Product product = new Product(null, null, false, "", one, "", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 1.0);
//
    //}
    //@Test
    //void if_animal_has_legs_multiply_number_of_legs_for_4point2() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
//
    //    Product product = new Product(2, null, false, "", null, "", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 8.4);
//
    //}
    //@Test
    //void if_animal_isSpider_multiply_number_of_legs_for_1point2() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
//
    //    Product product = new Product(6, null, false, "", null, "spider", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 7.2);
//
    //}
    //@Test
    //void if_animal_isSpider_and_isStinky_multiply_price_for_0point5() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
//
    //    Product product = new Product(6, null, true, "", null, "spider", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 3.6);
//
    //}
    //@Test
    //void if_animal_isSpider_and_red_add_2_to_price() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
//
    //    Product product = new Product(6, null, false, "red", null, "spider", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 9.2);
//
    //}
    //@Test
    //void if_animal_isSpider_and_gold_add_3_to_price() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
//
    //    Product product = new Product(6, null, false, "gold", null, "spider", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 10.2);
//
    //}
    //@Test
    //void if_animal_isSpider_and_gold_and_stinky_add_3_to_price_and_multiply_for_0point5() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
//
    //    Product product = new Product(6, null, true, "gold", null, "spider", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 6.6);
//
    //}
    //@Test
    //void if_animal_isSpider_and_red_and_stinky_add_2_to_price_and_multiply_for_0point5() {
    //    ShoppingCart shoppingCart = new ShoppingCart();
//
//
    //    Product product = new Product(6, null, true, "red", null, "spider", null);
//
    //    shoppingCart.addProduct(product);
//
    //    assertEquals(shoppingCart.getTotalPrice(), 5.6);
//
    //}
}