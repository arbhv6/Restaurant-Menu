package com.company;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean newItem;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = true;
    }

    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String getDescription() { return this.description; }
    public String getCategory() { return this.category; }
    public Boolean getNewItem() { return this.newItem; }


}
