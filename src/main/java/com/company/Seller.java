package com.company;

import com.company.model.Bouquet;

import java.util.List;
import java.util.Map;

public class Seller {
    private Menu menu;
    private List<Sellable> catalog;

    public Seller() {
        menu = new Menu();
    }

    public void processCustomerRequest() {
        int choose = menu.generateOfferPage();
        switch (choose) {
            case 1:

        }
    }

    public Bouquet createBoquet(Map<String, Integer> request) { //number of flower for any type
        return null;
    }

    public List<Sellable> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Sellable> catalog) {
        this.catalog = catalog;
    }
}
