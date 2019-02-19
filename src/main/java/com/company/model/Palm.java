package com.company.model;

import com.company.Sellable;

public class Palm implements Sellable {
    private int price;
    private String type;
    private int height;

    public Palm() {
    }

    public Palm(int price, String type, int height) {
        this.price = price;
        this.type = type;
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Palm{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", height=" + height +
                '}';
    }
}
