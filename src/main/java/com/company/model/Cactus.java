package com.company.model;

import com.company.Interfaces.ForSale;

public class Cactus implements ForSale {
    private int price;
    private boolean bloom;
    private String type;

    public Cactus() {
    }

    public Cactus(int price, boolean bloom, String type) {
        this.price = price;
        this.bloom = bloom;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBloom() {
        return bloom;
    }

    public void setBloom(boolean bloom) {
        this.bloom = bloom;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cactus:" +
                "type = " + type +
                ", bloom=" + bloom +
                ", price = " + price + '\'' +
                '.';
    }
}
