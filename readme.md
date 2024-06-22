# README: Code Cleaning Process and TTD

This README details the steps taken to clean and refactor the code in the three given versions of the `ShoppingCart` implementation. The process involved improving code readability, modularity, and functionality. Below is a step-by-step explanation of the refactoring process.

## Initial Code (Version 1)

### Code Overview

The initial code version consisted of a `ShoppingCart` class with a `calculatePrice` method handling various product price calculations based on different product attributes.

### Issues Identified


1. **Complexity and Readability**: The `calculatePrice` method was complex, handling multiple conditions, making it hard to read and maintain.
2. **Code Duplication**: Some logic was repeated in different parts of the method.
3. **Lack of Modularity**: The single method was responsible for too many different tasks.

### Refactoring Steps

1. **Extract Methods**: Broke down the `calculatePrice` method into multiple smaller methods, each handling specific price calculations.
2. **Use of Switch Expressions**: Used switch expressions for better readability and maintainability.
3. **Consistent BigDecimal Usage**: Ensured that all price calculations consistently used `BigDecimal`.

## Cleaned Code (Version 2)

### Code Overview

In the second version, the `calculatePrice` method was split into several helper methods, each handling specific cases (e.g., `spiderPrice`, `animalPrice`, `stinkyCheesePrice`).

### Refactoring Steps

1. **Further Method Extraction**: Continued breaking down the `calculatePrice` method into even more specific methods (e.g., `redMagicPrice`, `blueMagicPrice`).
2. **Refactor Magic Price Calculations**: Extracted common logic for `Magic: The Gathering` products into a method (`coloredMagicPrice`).
3. **Use of Switch Expressions**: Improved readability by using switch expressions for color-based price calculations.
4. **Refactor Repeated Logic**: Removed repeated code by creating helper methods for specific calculations.

### Final Code Structure

- **ShoppingCart Class**:
    - `addProduct(Product product)`
    - `getTotalPrice()`
    - `calculatePrice(Product product)`
    - `spiderPrice(Product product)`
    - `animalPrice(Product product)`
    - `stinkyCheesePrice(Product product)`
    - `gourmetPrice(Product product)`
    - `fishPrice(Product product)`
    - `redMagicPrice(Product product)`
    - `blueMagicPrice(Product product)`
    - `greenMagicPrice(Product product)`
    - `blackMagicPrice(Product product)`
    - `coloredMagicPrice(Product product)`

## Modularized Code (Version 3)

### Code Overview

In the third version, the code was further modularized by creating separate classes for different product types (`Fish`, `Terrestrial`, `MagicCards`, `Gourmet`).

### Refactoring Steps

1. **Interface Creation**: Created an `IProduct` interface to define the structure for different product types.
2. **Product Classes**: Implemented specific product classes (`Fish`, `Terrestrial`, `MagicCards`, `Gourmet`) adhering to the `IProduct` interface.
3. **Override Methods**: Each product class implemented the `calculateProductPrice` method to handle its specific price calculations.
4. **Base Class Implementation**: Each class provided concrete implementations for the properties defined in the `IProduct` interface.

### Final Code Structure

- **IProduct Interface**:
    - `BigDecimal calculateProductPrice()`
    - `BigDecimal getBasePrice()`
    - `String getName()`
    - `BigDecimal getNumberOfLegs()`
    - `String getColor()`
    - `boolean isStinky()`
    - `Integer getAge()`

- **Fish Class**:
    - `calculateProductPrice()`
    - `getBasePrice()`
    - `getColor()`
   

- **Terrestrial Class**:
    - Similar to `Fish`, with specific implementations for terrestrial animals.

- **MagicCards Class**:
    - Similar to `Fish`, with specific implementations for magic cards.

- **Gourmet Class**:
    - Similar to `Fish`, with specific implementations for gourmet products.
## Tests

### Overview

The tests were created to verify the functionality of the `ShoppingCart` class and the specific price calculations for different product types. The tests use the `JUnit` framework for validation.

### Test Cases

1. **MagicCards Tests**:
  - Verify the price for `MagicCards` based on color and age.
  - Example: `if_magic_card_is_red_return_3point5`, `if_magic_card_is_red_and_over_10_years_multiply_by_0point5`.

2. **Gourmet Tests**:
  - Verify the price for `Gourmet` products based on age and stinky property.
  - Example: `if_product_is_wine_multiply_number_of_years_per_20`, `if_product_is_stinky_cheese_multiply_number_of_years_per_10`.

3. **Fish Tests**:
  - Verify the price for `Fish` based on color and base price.
  - Example: `if_product_is_blue_fish_add_0point1_to_basePrice`, `if_product_is_golden_fish_multiply_100_for_basePrice`.

4. **Terrestrial Tests**:
  - Verify the price for `Terrestrial` animals based on the number of legs and other properties.
  - Example: `if_animal_has_legs_multiply_number_of_legs_for_4point2`, `if_animal_isSpider_multiply_number_of_legs_for_1point2`.

### Summary of Test Coverage

- **MagicCards**: Comprehensive tests covering different colors and age conditions.
- **Gourmet**: Tests for both stinky and non-stinky gourmet products.
- **Fish**: Tests for blue, gold, and regular fish price calculations.
- **Terrestrial**: Tests for animals with legs, spiders with various properties.


## Summary

The code refactoring process aimed at improving the structure, readability, and maintainability of the original code. By extracting methods, modularizing the code, and creating specific product classes, the final version achieves better separation of concerns and adheres to the Single Responsibility Principle. This modular approach allows for easier testing and extension of the codebase.
The tests ensure that each specific product price calculation is accurate and follows the defined business logic.

------------------------------------------------------------------------------------------------------

# README: Proceso de Limpieza de Código y TDD

Este README detalla los pasos tomados para limpiar y refactorizar el código en las tres versiones proporcionadas de la implementación de `ShoppingCart`. El proceso implicó mejorar la legibilidad del código, su modularidad y funcionalidad. A continuación, se presenta una explicación paso a paso del proceso de refactorización.

## Código Inicial (Versión 1)

### Visión General del Código

La versión inicial del código consistía en una clase `ShoppingCart` con un método `calculatePrice` que manejaba varios cálculos de precios de productos basados en diferentes atributos de los productos.

### Problemas Identificados

1. **Complejidad y Legibilidad**: El método `calculatePrice` era complejo, manejando múltiples condiciones, lo que dificultaba su lectura y mantenimiento.
2. **Duplicación de Código**: Algunas lógicas se repetían en diferentes partes del método.
3. **Falta de Modularidad**: El método único era responsable de demasiadas tareas diferentes.

### Pasos de Refactorización

1. **Extracción de Métodos**: Se dividió el método `calculatePrice` en varios métodos más pequeños, cada uno encargado de cálculos de precios específicos.
2. **Uso de Expresiones Switch**: Se utilizaron expresiones `switch` para mejorar la legibilidad y mantenibilidad.
3. **Uso Consistente de BigDecimal**: Se aseguró que todos los cálculos de precios utilizaran consistentemente `BigDecimal`.

## Código Limpio (Versión 2)

### Visión General del Código

En la segunda versión, el método `calculatePrice` se dividió en varios métodos auxiliares, cada uno manejando casos específicos (por ejemplo, `spiderPrice`, `animalPrice`, `stinkyCheesePrice`).

### Pasos de Refactorización

1. **Extracción Adicional de Métodos**: Se continuó dividiendo el método `calculatePrice` en métodos aún más específicos (por ejemplo, `redMagicPrice`, `blueMagicPrice`).
2. **Refactorización de Cálculos de Magia**: Se extrajo la lógica común para productos de `Magic: The Gathering` en un método (`coloredMagicPrice`).
3. **Uso de Expresiones Switch**: Se mejoró la legibilidad mediante el uso de expresiones `switch` para cálculos de precios basados en colores.
4. **Refactorización de Lógica Repetida**: Se eliminó código repetido creando métodos auxiliares para cálculos específicos.

### Estructura Final del Código

- **Clase ShoppingCart**:
  - `addProduct(Product product)`
  - `getTotalPrice()`
  - `calculatePrice(Product product)`
  - `spiderPrice(Product product)`
  - `animalPrice(Product product)`
  - `stinkyCheesePrice(Product product)`
  - `gourmetPrice(Product product)`
  - `fishPrice(Product product)`
  - `redMagicPrice(Product product)`
  - `blueMagicPrice(Product product)`
  - `greenMagicPrice(Product product)`
  - `blackMagicPrice(Product product)`
  - `coloredMagicPrice(Product product)`

## Código Modularizado (Versión 3)

### Visión General del Código

En la tercera versión, el código se modularizó aún más creando clases separadas para diferentes tipos de productos (`Fish`, `Terrestrial`, `MagicCards`, `Gourmet`).

### Pasos de Refactorización

1. **Creación de Interfaz**: Se creó una interfaz `IProduct` para definir la estructura de diferentes tipos de productos.
2. **Clases de Productos**: Se implementaron clases específicas de productos (`Fish`, `Terrestrial`, `MagicCards`, `Gourmet`) siguiendo la interfaz `IProduct`.
3. **Métodos Sobrescritos**: Cada clase de producto implementó el método `calculateProductPrice` para manejar sus cálculos de precios específicos.
4. **Implementación de Clase Base**: Cada clase proporcionó implementaciones concretas para las propiedades definidas en la interfaz `IProduct`.

### Estructura Final del Código

- **Interfaz IProduct**:
  - `BigDecimal calculateProductPrice()`
  - `BigDecimal getBasePrice()`
  - `String getName()`
  - `BigDecimal getNumberOfLegs()`
  - `String getColor()`
  - `boolean isStinky()`
  - `Integer getAge()`

- **Clase Fish**:
  - `calculateProductPrice()`
  - `getBasePrice()`
  - `getColor()`

- **Clase Terrestrial**:
  - Similar a `Fish`, con implementaciones específicas para animales terrestres.

- **Clase MagicCards**:
  - Similar a `Fish`, con implementaciones específicas para cartas de magia.

- **Clase Gourmet**:
  - Similar a `Fish`, con implementaciones específicas para productos gourmet.

## Pruebas

### Visión General

Las pruebas fueron creadas para verificar la funcionalidad de la clase `ShoppingCart` y los cálculos específicos de precios para diferentes tipos de productos. Las pruebas utilizan el framework `JUnit` para la validación.

### Casos de Prueba

1. **Pruebas de MagicCards**:
  - Verificar el precio de `MagicCards` basado en color y edad.
  - Ejemplo: `if_magic_card_is_red_return_3point5`, `if_magic_card_is_red_and_over_10_years_multiply_by_0point5`.

2. **Pruebas de Gourmet**:
  - Verificar el precio de productos `Gourmet` basado en edad y propiedad de ser "stinky".
  - Ejemplo: `if_product_is_wine_multiply_number_of_years_per_20`, `if_product_is_stinky_cheese_multiply_number_of_years_per_10`.

3. **Pruebas de Fish**:
  - Verificar el precio de `Fish` basado en color y precio base.
  - Ejemplo: `if_product_is_blue_fish_add_0point1_to_basePrice`, `if_product_is_golden_fish_multiply_100_for_basePrice`.

4. **Pruebas de Terrestrial**:
  - Verificar el precio de animales `Terrestrial` basado en el número de patas y otras propiedades.
  - Ejemplo: `if_animal_has_legs_multiply_number_of_legs_for_4point2`, `if_animal_isSpider_multiply_number_of_legs_for_1point2`.

### Resumen de Cobertura de Pruebas

- **MagicCards**: Pruebas exhaustivas que cubren diferentes colores y condiciones de edad.
- **Gourmet**: Pruebas para productos gourmet con y sin propiedad "stinky".
- **Fish**: Pruebas para cálculos de precios de peces azules, dorados y regulares.
- **Terrestrial**: Pruebas para animales con patas y arañas con diversas propiedades.

## Resumen

El proceso de refactorización del código tuvo como objetivo mejorar la estructura, legibilidad y mantenibilidad del código original. Al extraer métodos, modularizar el código y crear clases específicas de productos, la versión final logra una mejor separación de responsabilidades y cumple con el Principio de Responsabilidad Única. Este enfoque modular facilita las pruebas y la extensión del código.

Las pruebas garantizan que cada cálculo de precio de producto específico sea preciso y siga la lógica de negocio definida.

