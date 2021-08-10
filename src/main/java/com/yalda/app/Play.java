package com.yalda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Play {
    public static WeddingPackages choosePackages(Scanner in) {
        boolean correctInput;
        WeddingPackages selectedPackage = null;
        WeddingPackages packageOne = new WeddingPackages(1, 4, null, null, "sit down", 160);
        WeddingPackages packageTwo = new WeddingPackages(2, 5, null, null, "sit down", 180);
        WeddingPackages packageThree = new WeddingPackages(3, 6, null, null, "sit down", 200);
        WeddingPackages packageFour = new WeddingPackages(4, 4, null, null, "Roving", 120);
        WeddingPackages packageFive = new WeddingPackages(5, 5, null, null, "Roving", 140);
        WeddingPackages packageSix = new WeddingPackages(6, 6, null, null, "Roving", 160);

        List<WeddingPackages> packages = new ArrayList<WeddingPackages>();
        packages.add(packageOne);
        packages.add(packageTwo);
        packages.add(packageThree);
        packages.add(packageFour);
        packages.add(packageFive);
        packages.add(packageSix);

        System.out.println("\"Welcome to our venue\" \n" +
                "Below is the list of our wedding packages to make you night more memorable. \n");

        for (WeddingPackages aPackage : packages) {
            System.out.println(aPackage.toString());
        }

        System.out.println("Please select your desirable package to continue. select by entering the package number.");
        do {
            String nextInput = in.next();
            selectedPackage = getWeddingPackage(packages, nextInput);
        } while (selectedPackage == null);
        return selectedPackage;
    }

    public static WeddingPackages getWeddingPackage(List<WeddingPackages> packages, String nextInput) {
        switch (nextInput) {
            case "1":
                System.out.println("Congratulations, you chose package One.\n");
                return packages.get(0);
            case "2":
                System.out.println("Congratulations, you chose package Two.\n");
                return packages.get(1);
            case "3":
                System.out.println("Congratulations, you chose package Three.\n");
                return packages.get(2);
            case "4":
                System.out.println("Congratulations, you chose package Four.\n");
                return packages.get(3);
            case "5":
                System.out.println("Congratulations, you chose package Five.\n");
                return packages.get(4);
            case "6":
                System.out.println("Congratulations, you chose package Six.\n");
                return packages.get(5);
            default:
                System.out.println("Please choose a package to proceed !(enter the package number)\n");
                return null;
        }
    }

    public static List<AddOn> chooseAddOns(Scanner in) {

        double totalPrice = 0;
        int quantity = 0;
        boolean selectedInput;
        boolean noAddOn = false;
        List<AddOn> selectedAddOn = new ArrayList<AddOn>();

        System.out.println("To make your night even more delightful, we strongly recommend " +
                "to add the items below to your package! \n");

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

        List<AddOn> items = new ArrayList<AddOn>();
        items.add(itemOne);
        items.add(itemTwo);
        items.add(itemThree);
        items.add(itemFour);
        items.add(itemFive);

        for (AddOn item : items) {
            System.out.println(item.toString());
        }
        System.out.println("If you wish to add any of the additional items, just enter the item number." +
                "(select no if you do not want any)\n");

        do {
            selectedInput = true;
            int index = 0;
            switch (in.next().toLowerCase()) {
                case "1":
                    System.out.println("Gold Candle holders, will be added to your  wedding package.");
                    selectedAddOn.add(itemOne);
                    index = selectedAddOn.indexOf(itemOne);
                    System.out.println("How many Gold candle holders would you like to add?");
                    quantity = in.nextInt();
                    totalPrice = selectedAddOn.get(index).getPrice() * quantity;
                    selectedAddOn.get(index).setPrice(totalPrice);
                    break;
                case "2":
                    System.out.println("Featured goblet, will be added to your  wedding package.");
                    selectedAddOn.add(itemTwo);
                    index = selectedAddOn.indexOf(itemTwo);
                    System.out.println("How many Featured Goblets would you like to add?");
                    quantity = in.nextInt();
                    totalPrice = selectedAddOn.get(index).getPrice() * quantity;
                    selectedAddOn.get(index).setPrice(totalPrice);
                    break;
                case "3":
                    System.out.println("Steel feature table, will be added to your  wedding package.\n");
                    selectedAddOn.add(itemThree);
                    break;
                case "4":
                    System.out.println("Whiskey/Spirits station, will be added to your  wedding package.\n");
                    selectedAddOn.add(itemFour);
                    break;
                case "5":
                    System.out.println("Audio visuals, will be added to your  wedding package.\n");
                    selectedAddOn.add(itemFive);
                    break;
                case "no":
                    System.out.println("We will proceed to the next step.\n");
                    noAddOn = true;
                    break;
                default:
                    System.out.println("please select at least one of the items or enter No to continue.\n");
                    selectedInput = false;
                    break;
            }
            if (!noAddOn) {
                System.out.println("Do you want to add another Item? (enter Yes or No)");
                String answer = in.next();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Please select another Item by entering its number:");
                    selectedInput = false;
                } else if(answer.equalsIgnoreCase("no")) {
                    selectedInput = true;
                }else{
                    System.out.println("Please select the correct item number or enter No to proceed.");
                    selectedInput = false;
                }
            }
        } while (!selectedInput);

        return selectedAddOn;
    }

    public static DrinkPackages chooseDrinkPackages(Scanner in) {
        DrinkPackages selectedDrinkPackage = null;

        System.out.println("Please choose one of our finest drink packages.");

        DrinkPackages drinkPackageOne = new DrinkPackages(1, 0, "Standard Package", "House wines and beers.");
        DrinkPackages drinkPackageTwo = new DrinkPackages(2, 20, "Classic Package", "Classic wines and beers will be added to your drink menu, the price will be added to each person.");
        DrinkPackages drinkPackageThree = new DrinkPackages(3, 40, "Platinum Package", "platinum wines and beers will be added to your drink menu, the price will be added to each person.");

        List<DrinkPackages> drinkPackages = new ArrayList<DrinkPackages>();
        drinkPackages.add(drinkPackageOne);
        drinkPackages.add(drinkPackageTwo);
        drinkPackages.add(drinkPackageThree);

        for (DrinkPackages drinkPackage : drinkPackages) {
            System.out.println(drinkPackage.toString());
        }
        do {
            String nextInput = in.next();
            selectedDrinkPackage = getDrinkPackages(drinkPackages, nextInput);
        } while (selectedDrinkPackage == null);
        return selectedDrinkPackage;
    }

    public static DrinkPackages getDrinkPackages(List<DrinkPackages> drinkPackage, String nextInput) {
        switch (nextInput) {
            case "1":
                System.out.println("Standard drink package is added to your wedding package.\n");
                return drinkPackage.get(0);
            case "2":
                System.out.println("Classic drink package is added to your wedding package.\n");
                return drinkPackage.get(1);
            case "3":
                System.out.println("Platinum drink package is added to your wedding package.\n");
                return drinkPackage.get(2);
            default:
                System.out.println("The night can't be completed without a good drink, please select at least one of the drink packages.");
                return null;
        }
    }

    public static void calculateTotalPrice(WeddingPackages wp, DrinkPackages dp, List<AddOn> ao, Scanner in) {
        System.out.println("How many guests are you planning to have?");
        double addOnsPrice = 0;
        for (AddOn addOn : ao) {
            addOnsPrice += addOn.getPrice();
        }
        int peopleInvited = in.nextInt();
        double totalPrice = (wp.getPrice() * peopleInvited) + (dp.getPrice() * peopleInvited) + addOnsPrice;
        System.out.println("Your estimated total price based on your chosen options is $" + totalPrice + ".\n");
    }
}
