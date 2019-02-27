package com.company.BusinessLogic;

import com.company.Interfaces.ForSale;
import com.company.Menu;

import java.util.List;
import java.util.Map;

public class Seller {
    private Menu menu;
    private List<ForSale> catalog;

    public Seller() {
        menu = new Menu();
    }

    public void processCustomerRequest() {
        int choose = menu.generateOfferPage();

    }

        public List<ForSale> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<ForSale> catalog) {
        this.catalog = catalog;
    }
}
