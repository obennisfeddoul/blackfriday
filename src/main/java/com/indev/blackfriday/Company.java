package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.HashMap;

public class Company {

    private HashMap<String,Product> products = new HashMap<String, Product>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        products.put(capsule,new Product(i,capsule,i1));
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        double total = 0;
        for (Product p: products.values()) {
            total+=p.getPrix()*p.getQuantity();
        }
        return (int) total;
    }

    public Company blackFriday() {
        return this;
    }
}
