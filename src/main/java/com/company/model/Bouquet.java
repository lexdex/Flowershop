package com.company.model;

import java.util.Map;

public class Bouquet  {
    private Map<Integer, Flower> flowers;
    private Decoration decoration;

    public Bouquet() {}

    public Bouquet(Map<Integer, Flower> flowers) {
        this.flowers = flowers;
    }


    public int getFullPrice(){
        int counter=0;
        for (Map.Entry<Integer,Flower> entry: flowers.entrySet()){
          counter+=entry.getValue().getPrice();
        }
        return counter+decoration.Price;
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
