package com.company.model;

import com.company.Interfaces.ForSale;
import com.company.Sellable;

import java.util.List;
import java.util.Map;

public class Bouquet  {
    private Map<Integer, Flower> flowers;
    private Decoration decoration;

    public Bouquet() {}

    public Bouquet(Map<Integer, Flower> flowers) {

        this.flowers = flowers;
    }


    public Map<Integer, Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(Map<Integer, Flower> flowers) {
        this.flowers = flowers;
    }

    public void showAllFlowers() {
        for (Map.Entry<Integer, Flower> el: flowers.entrySet()) {
            System.out.println(el.getValue() + " - " + el.getKey() + "unit(s).");
        }
    }
}
