package com.yalda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        WeddingPackages packageChosen = Play.choosePackages(input);
        List<AddOn> addOnChosen = Play.chooseAddOns(input);
        DrinkPackages drinkPackageChosen = Play.chooseDrinkPackages(input);
        packageChosen.setAddOns(addOnChosen);
        packageChosen.setDrinkPackages(drinkPackageChosen);
        Play.calculateTotalPrice(packageChosen, drinkPackageChosen, addOnChosen, input);

        input.close();
    }


}

