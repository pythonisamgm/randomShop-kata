package org.example;

import java.math.BigDecimal;

public interface IProduct {

    String getName();
    BigDecimal getNumberOfLegs();
    String getColor();
    boolean isStinky();
    Integer getAge();
    BigDecimal calculateProductPrice();
    BigDecimal getBasePrice();


}
