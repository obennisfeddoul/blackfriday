package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.HashMap;

public class Company {

    private  double MARGE_OF_BENEFITS = 1.2;
    private   int QUANTITY_SELLED = 5;

    private HashMap<String,Product> products = new HashMap<String, Product>();
    private HashMap<String,Product> productsSalled = new HashMap<String, Product>();

    public float sells(String capsule) {
        float newPrice = (float) (products.get(capsule).getPrix()*MARGE_OF_BENEFITS);

        if(products.get(capsule).getQuantity()-QUANTITY_SELLED <0){
            throw new RuntimeException();
        }else{
            products.get(capsule).setQuantity(products.get(capsule).getQuantity()-QUANTITY_SELLED);
            if(productsSalled.containsKey(capsule)){
                productsSalled.get(capsule).setQuantity(productsSalled.get(capsule).getQuantity()+QUANTITY_SELLED);
            }else {
                productsSalled.put(capsule,new Product(newPrice,capsule,QUANTITY_SELLED));
            }
        }
        return newPrice*QUANTITY_SELLED;
    }

    public void stock(int quantity, String capsule, int price) {
        products.put(capsule,new Product(price,capsule,quantity));
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
        for (Product p: productsSalled.values()) {
            total+=p.getPrix()*p.getQuantity();
        }
        return (int) total;
    }

    public Company blackFriday() {
        return new Company(1.1,QUANTITY_SELLED*2,products,productsSalled);
    }

    public Company(double MARGE_OF_BENEFITS, int QUANTITY_SELLED, HashMap<String, Product> products, HashMap<String, Product> productsSalled) {
        this.MARGE_OF_BENEFITS = MARGE_OF_BENEFITS;
        this.QUANTITY_SELLED = QUANTITY_SELLED;
        this.products = products;
        this.productsSalled = productsSalled;
    }

    public Company() {
    }
}
