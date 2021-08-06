package com.yalda.app;

public class AddOns {
    int id;
    double price;
    String name;
    String details;

    public AddOns(int id, double price, String name, String details) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.details = details;
    }
    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Add On number: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Details: " + this.details + "\n" +
                "Price: $" + this.price + "\n";
    }
}
