package com.yalda.app;

public class WeddingPackages {
    int id;
    int hours;
    AddOns addOns;
    DrinkPackages drinkPackages;
    String styles; //sited down or roving
    double price;

    public WeddingPackages(int id, int hours, AddOns addOns, DrinkPackages drinkPackages, String styles, double price) {
        this.id = id;
        this.hours = hours;
        this.addOns = addOns;
        this.drinkPackages = drinkPackages;
        this.styles = styles;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public AddOns getAddOns() {
        return addOns;
    }

    public void setAddOns(AddOns addOns) {
        this.addOns = addOns;
    }

    public DrinkPackages getDrinkPackages() {
        return drinkPackages;
    }

    public void setDrinkPackages(DrinkPackages drinkPackages) {
        this.drinkPackages = drinkPackages;
    }

    public String getStyles() {
        return styles;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Package number: " + this.id + "\n" +
                "Hours: " + this.hours + "\n" +
                "Style: " + this.styles + "\n" +
                "Price: $" + this.price + "\n";
    }
}
