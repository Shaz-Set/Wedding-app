package com.yalda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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

        for (int i = 0; i<packages.size(); i++){
            System.out.println(packages.get(i).toString());
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Please choose between the packages below:");

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
                break;
        }
    }
}
