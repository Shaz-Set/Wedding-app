package com.yalda.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeddingPackagesTest {

    @Test
    void WeddingPackageToString() {
        WeddingPackages weddingPackage = new WeddingPackages(1, 4, null, null, "sit down", 160);
        assertEquals("Package number 1\n" +
                "Hours: 4\n" +
                "Style: sit down\n" +
                "Price: $160.0\n", weddingPackage.toString());
    }
}