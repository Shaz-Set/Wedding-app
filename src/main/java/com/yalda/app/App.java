package com.yalda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App.choosePackage();
    }

    public static void choosePackage() {
        boolean correctInput = true;
        do {
            WeddingPackages packageOne = new WeddingPackages(1, 4, "none", "none", "sit down", 160);
            WeddingPackages packageTwo = new WeddingPackages(2, 5, "none", "none", "sit down", 180);
            WeddingPackages packageThree = new WeddingPackages(3, 6, "none", "none", "sit down", 200);
            WeddingPackages packageFour = new WeddingPackages(4, 4, "none", "none", "Roving", 120);
            WeddingPackages packageFive = new WeddingPackages(5, 5, "none", "none", "Roving", 140);
            WeddingPackages packageSix = new WeddingPackages(6, 6, "none", "none", "Roving", 160);

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
                    break;
                case "2":
                    System.out.println("Congratulations, you chose package Two.");
                    break;
                case "3":
                    System.out.println("Congratulations, you chose package Three.");
                    break;
                case "4":
                    System.out.println("Congratulations, you chose package Four.");
                    break;
                case "5":
                    System.out.println("Congratulations, you chose package Five.");
                    break;
                case "6":
                    System.out.println("Congratulations, you chose package Six.");
                    break;
                default:
                    System.out.println("Please choose a package to proceed !");
                    correctInput = false;
                    break;
            }
            input.close();
        } while (!correctInput);

        System.out.println("Do you want to add any of the items below?  ");
        AddOns itemOne = new AddOns(1, 3, "GOLD CANDLE HOLDERS",
                "Comes with the white candles, $3 each");
        AddOns itemTwo = new AddOns(2, 2, "FEATURED GOBLET ",
                "White fleur or gold rimmed, $2 each");
        AddOns itemThree = new AddOns(3,200,"STEEL FEATURE TABLE",
                "2m, 3m, or both combined");
        AddOns itemFour = new AddOns(4,500,"WHISKEY/SPIRITS STATION",
                "glassware, decanters, leather suitcases, timber crates - includes bartender");
        AddOns itemFive = new AddOns(4,250,"AUDIO VISUAL",
                "Data projector and 2.4m hanging screen ");
    }
}


