package com.yalda.app;

public class WeddingPackages {
    int id;
    int hours;
    String addOns;
    String drinkPackages;
    String styles; //sited down or roving
    double price;

    public WeddingPackages(int id, int hours, String addOns, String drinkPackages, String styles, double price) {
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

    public int getHours() {
        return hours;
    }

    public String getAddOns() {
        return addOns;
    }

    public String getDrinkPackages() {
        return drinkPackages;
    }

    public String getStyles() {
        return styles;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }

    public void setDrinkPackages(String drinkPackages) {
        this.drinkPackages = drinkPackages;
    }

    public void setStyles(String styles) {
        this.styles = styles;
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
