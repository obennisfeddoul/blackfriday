package com.indev.blackfriday;

import java.util.ArrayList;

public class Company {

    private ArrayList<Product> products = new ArrayList<Product>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        products.add(new Product(i,capsule,i1));
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        double total = 0;
        for (int i=0;i<products.size();i++){
            total+=products.get(i).getPrix()*products.get(i).getQuantity();
        }
        return (int) total;
    }

    public Company blackFriday() {
        return this;
    }
}
