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
        System.out.println("So happy to see you here, Do you want to enter your phone number, so we can be in touch?(please enter yes or no)");
        if(input.next().equalsIgnoreCase("yes")){
            System.out.println("please enter your phone number.");
            String phoneNumber = input.next();
            System.out.println("Can't wait to see you!\nYou will be contacted shortly to arrange inspection and consultation date.");
        }else{
            System.out.println("So sad to see you leave, hope to see you around again!");
        }
        input.close();
    }
}
