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

    public String getName() {
        return name;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
