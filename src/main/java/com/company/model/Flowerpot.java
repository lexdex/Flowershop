package com.company.model;

import com.company.Interfaces.ForSale;
import com.company.Sellable;

public class Flowerpot implements ForSale {
    private int price;
    private String plantType;
    private String plantColor;
    private String potMaterial;

    public Flowerpot() {
    }

    public Flowerpot(int price, String plantType, String plantColor, String potMaterial) {
        this.price = price;
        this.plantType = plantType;
        this.plantColor = plantColor;
        this.potMaterial = potMaterial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getPlantColor() {
        return plantColor;
    }

    public void setPlantColor(String plantColor) {
        this.plantColor = plantColor;
    }

    public String getPotMaterial() {
        return potMaterial;
    }

    public void setPotMaterial(String potMaterial) {
        this.potMaterial = potMaterial;
    }

    @Override
    public String toString() {
        return "Flowerpot{" +
                "price=" + price +
                ", plantType='" + plantType + '\'' +
                ", plantColor='" + plantColor + '\'' +
                ", potMaterial='" + potMaterial + '\'' +
                '}';
    }
}
