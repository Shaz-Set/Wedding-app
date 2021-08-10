package com.yalda.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayTest {

    private List<WeddingPackages> packages;

    WeddingPackages packageOne = new WeddingPackages(1, 4, null, null, "sit down", 160);
    WeddingPackages packageTwo = new WeddingPackages(2, 5, null, null, "sit down", 180);
    WeddingPackages packageThree = new WeddingPackages(3, 6, null, null, "sit down", 200);
    WeddingPackages packageFour = new WeddingPackages(4, 4, null, null, "Roving", 120);
    WeddingPackages packageFive = new WeddingPackages(5, 5, null, null, "Roving", 140);
    WeddingPackages packageSix = new WeddingPackages(6, 6, null, null, "Roving", 160);

    @BeforeEach
    void setUp() {

        packages = new ArrayList<WeddingPackages>();
        packages.add(packageOne);
        packages.add(packageTwo);
        packages.add(packageThree);
        packages.add(packageFour);
        packages.add(packageFive);
        packages.add(packageSix);
    }

    @Test
    void testGetWeddingPackages() {
        WeddingPackages selectedPackage = null;
        selectedPackage = Play.getWeddingPackage(packages,"1");
        assertEquals(packageOne,selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages,"2");
        assertEquals(packageTwo,selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages,"3");
        assertEquals(packageThree,selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages,"4");
        assertEquals(packageFour,selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages,"5");
        assertEquals(packageFive,selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages,"6");
        assertEquals(packageSix,selectedPackage);

        //testing to see if the selected package is null if the user type the wrong input
        selectedPackage = Play.getWeddingPackage(packages,"25");
        assertNull(selectedPackage);
    }





}