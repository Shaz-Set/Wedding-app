package com.yalda.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkPackagesTest {

    @Test
    void testToString() {
        DrinkPackages dp = new DrinkPackages(1,0,"Standard Package", "House wines and beers.");
        assertEquals("Drink package number 1\n" +
                "Name: Standard Package\n" +
                "Details: House wines and beers.\n" +
                "Price: $0.0\n", dp.toString());
    }
}