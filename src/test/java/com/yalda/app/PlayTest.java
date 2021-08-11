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

    private List<DrinkPackages> drinkPackages;

    DrinkPackages drinkPackageOne = new DrinkPackages(1, 0, "Standard Package", "House wines and beers.");
    DrinkPackages drinkPackageTwo = new DrinkPackages(2, 20, "Classic Package", "Classic wines and beers will be added to your drink menu, the price will be added to each person.");
    DrinkPackages drinkPackageThree = new DrinkPackages(3, 40, "Platinum Package", "platinum wines and beers will be added to your drink menu, the price will be added to each person.");

    List<AddOn> items;
    AddOn itemOne = new AddOn(1, 3, "GOLD CANDLE HOLDERS",
            "Comes with the white candles, $3 each");
    AddOn itemTwo = new AddOn(2, 2, "FEATURED GOBLET ",
            "White fleur or gold rimmed, $2 each");
    AddOn itemThree = new AddOn(3, 200, "STEEL FEATURE TABLE",
            "2m, 3m, or both combined");
    AddOn itemFour = new AddOn(4, 500, "WHISKEY/SPIRITS STATION",
            "glassware, decanters, leather suitcases, timber crates - includes bartender");
    AddOn itemFive = new AddOn(5, 250, "AUDIO VISUAL",
            "Data projector and 2.4m hanging screen ");

    @BeforeEach
    void setUp() {

        packages = new ArrayList<WeddingPackages>();
        packages.add(packageOne);
        packages.add(packageTwo);
        packages.add(packageThree);
        packages.add(packageFour);
        packages.add(packageFive);
        packages.add(packageSix);

        drinkPackages = new ArrayList<DrinkPackages>();
        drinkPackages.add(drinkPackageOne);
        drinkPackages.add(drinkPackageTwo);
        drinkPackages.add(drinkPackageThree);

        items = new ArrayList<AddOn>();
        items.add(itemOne);
        items.add(itemTwo);
        items.add(itemThree);
        items.add(itemFour);
        items.add(itemFive);
    }

    @Test
    void testGetWeddingPackages() {
        WeddingPackages selectedPackage = null;
        selectedPackage = Play.getWeddingPackage(packages, "1");
        assertEquals(packageOne, selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages, "2");
        assertEquals(packageTwo, selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages, "3");
        assertEquals(packageThree, selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages, "4");
        assertEquals(packageFour, selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages, "5");
        assertEquals(packageFive, selectedPackage);

        selectedPackage = Play.getWeddingPackage(packages, "6");
        assertEquals(packageSix, selectedPackage);

        //testing to see if the selected package is null if the user type the wrong input
        selectedPackage = Play.getWeddingPackage(packages, "25");
        assertNull(selectedPackage);
    }

    @Test
    void testGetDrinkPackages() {
        DrinkPackages selectedDP = null;
        selectedDP = Play.getDrinkPackages(drinkPackages, "1");
        assertEquals(drinkPackageOne, selectedDP);

        selectedDP = Play.getDrinkPackages(drinkPackages, "2");
        assertEquals(drinkPackageTwo, selectedDP);

        selectedDP = Play.getDrinkPackages(drinkPackages, "3");
        assertEquals(drinkPackageThree, selectedDP);

        selectedDP = Play.getDrinkPackages(drinkPackages, "gh");
        assertNull(selectedDP);
    }

    @Test
    void testChooseAddOn(){
        Scanner in = new Scanner(System.in);
        List<AddOn> selectedAddOn = Play.chooseAddOns(in);
    }

    @Test
    void testCalculateTotalPrice() {
        Scanner in = new Scanner(System.in);
        //double totalPrice = calculateTotalPrice(WeddingPackages wp, DrinkPackages dp, , Scanner in);
    }


}