package com.yalda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        WeddingPackages packageChosen = App.choosePackages();
        AddOns addOnsChosen = App.chooseAddOns();
        DrinkPackages drinkPackageChosen = App.chooseDrinkPackages();
        packageChosen.setAddOns(addOnsChosen);
        packageChosen.setDrinkPackages(drinkPackageChosen);
    }

    public static WeddingPackages choosePackages() {
        boolean correctInput = true;
        WeddingPackages selectedPackage = null;
        //do {
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

            System.out.println("Please choose one of the packages below: (choose by entering the package number.)");

            for (int i = 0; i < packages.size(); i++) {
                System.out.println(packages.get(i).toString());
            }

            Scanner input = new Scanner(System.in);

            switch (input.next()) {
                case "1":
                    System.out.println("Congratulations, you chose package One.");
                    selectedPackage = packageOne;
                    break;
                case "2":
                    System.out.println("Congratulations, you chose package Two.");
                    selectedPackage = packageTwo;
                    break;
                case "3":
                    System.out.println("Congratulations, you chose package Three.");
                    selectedPackage = packageThree;
                    break;
                case "4":
                    System.out.println("Congratulations, you chose package Four.");
                    selectedPackage = packageFour;
                    break;
                case "5":
                    System.out.println("Congratulations, you chose package Five.");
                    selectedPackage = packageFive;
                    break;
                case "6":
                    System.out.println("Congratulations, you chose package Six.");
                    selectedPackage = packageSix;
                    break;
                default:
                    System.out.println("Please choose a package to proceed !");
                    correctInput = false;
                    break;
            }
            input.close();
       // } while (!correctInput);
        return selectedPackage;
    }

    public static AddOns chooseAddOns() {
        double totalPrice = 0;
        int quantity = 0;
        AddOns selectedAddOn = null;
        System.out.println("Do you want to add any of the items below?  ");
        AddOns itemOne = new AddOns(1, 3, "GOLD CANDLE HOLDERS",
                "Comes with the white candles, $3 each");
        AddOns itemTwo = new AddOns(2, 2, "FEATURED GOBLET ",
                "White fleur or gold rimmed, $2 each");
        AddOns itemThree = new AddOns(3, 200, "STEEL FEATURE TABLE",
                "2m, 3m, or both combined");
        AddOns itemFour = new AddOns(4, 500, "WHISKEY/SPIRITS STATION",
                "glassware, decanters, leather suitcases, timber crates - includes bartender");
        AddOns itemFive = new AddOns(4, 250, "AUDIO VISUAL",
                "Data projector and 2.4m hanging screen ");

        List<AddOns> items = new ArrayList<AddOns>();
        items.add(itemOne);
        items.add(itemTwo);
        items.add(itemThree);
        items.add(itemFour);
        items.add(itemFive);

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
        }

        Scanner input1 = new Scanner(System.in);

        switch (input1.next()) {
            case "1":
                System.out.println("Gold Candle holders, will be added to your  wedding package.");
                selectedAddOn = itemOne;
                break;
            case "2":
                System.out.println("Featured goblet, will be added to your  wedding package.");
                selectedAddOn = itemTwo;
                break;
            case "3":
                System.out.println("Steel feature table, will be added to your  wedding package.");
                selectedAddOn = itemThree;
                break;
            case "4":
                System.out.println("Whiskey/Spirits station, will be added to your  wedding package.");
                selectedAddOn = itemFour;
                break;
            case "5":
                System.out.println("Audio visuals, will be added to your  wedding package.");
                selectedAddOn = itemFive;
                break;
            default:
                System.out.println("please select at least one of the items or enter NO to continue.");
                break;
        }
        input1.close();

        Scanner input2 = new Scanner(System.in);

        if (selectedAddOn == itemOne) {
            System.out.println("How many Gold candle holders would you like to add?");
            quantity = input2.nextInt();
            totalPrice = selectedAddOn.getPrice() * quantity;
            selectedAddOn.setPrice(totalPrice);
        } else if (selectedAddOn == itemTwo) {
            System.out.println("How many Featured Goblets would you like to add?");
            quantity = input2.nextInt();
            totalPrice = selectedAddOn.getPrice() * quantity;
            selectedAddOn.setPrice(totalPrice);
        }
        input2.close();
        return selectedAddOn;
    }

    public static DrinkPackages chooseDrinkPackages(){
        DrinkPackages selectedDrinkPackage = null;
        System.out.println("Please choose one of the drink packages below.");

        DrinkPackages drinkPackageOne = new DrinkPackages(1,0,"Standard Package","House wines and beers.");
        DrinkPackages drinkPackageTwo = new DrinkPackages(2,20,"Classic Package","Classic wines and beers will be added to your drink menu, the price will be added to each person. ");
        DrinkPackages drinkPackageThree = new DrinkPackages(3,40,"Platinum Package","platinum wines and beers will be added to your drink menu, the price will be added to each person.");

        List<DrinkPackages> drinkPackages = new ArrayList<DrinkPackages>();
        drinkPackages.add(drinkPackageOne);
        drinkPackages.add(drinkPackageTwo);
        drinkPackages.add(drinkPackageThree);

        for (int i = 0; i < drinkPackages.size(); i++) {
            System.out.println(drinkPackages.get(i).toString());
        }
        Scanner input3 = new Scanner(System.in);
        switch (input3.next()) {
            case "1":
                System.out.println("Gold Candle holders, will be added to your  wedding package.");
                selectedDrinkPackage = drinkPackageOne;
                break;
            case "2":
                System.out.println("Featured goblet, will be added to your  wedding package.");
                selectedDrinkPackage = drinkPackageTwo;
                break;
            case "3":
                System.out.println("Steel feature table, will be added to your  wedding package.");
                selectedDrinkPackage = drinkPackageThree;
            default:
                System.out.println("please select at least one of the drink packages.");
                break;
        }
        input3.close();
        return selectedDrinkPackage;
    }

    public static double calculateTotalPrice( WeddingPackages wp, DrinkPackages dp, AddOns ao){
        Scanner input4 = new Scanner(System.in);
        System.out.println("How many guests are you planning to have?");
        int peopleInvited = input4.nextInt();
        double totalPrice = (wp.getPrice()*peopleInvited) + (dp.getPrice()*peopleInvited) + ao.getPrice();
        return totalPrice;
    }


}

