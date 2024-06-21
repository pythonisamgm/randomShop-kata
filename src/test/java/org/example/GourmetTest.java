package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GourmetTest {
    @Test
    void if_product_is_wine_multiply_age_in_year_per_20() {
        Gourmet gourmet = new Gourmet(false, 10);
        assertEquals(gourmet.calculateProductPrice(), 200.0);

    }

    @Test
    void if_product_is_stinky_cheese_multiply_age_in_year_per_10() {
        Gourmet gourmet = new Gourmet(true, 10);
        assertEquals(gourmet.calculateProductPrice(), 100.0);

    }
}


