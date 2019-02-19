package com.company.model;

import com.company.Sellable;

public class Flower implements Sellable {
    private String type;
    private int price;

    public Flower() {
    }

    public Flower(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
