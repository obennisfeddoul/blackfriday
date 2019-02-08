package com.indev.blackfriday;

public class Product {
    private double prix;
    private String name;
    private int quantity;

    public Product(double prix, String name, int quantity) {
        this.prix = prix;
        this.name = name;
        this.quantity = quantity;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantity() {
        return quantity;
    }
}
