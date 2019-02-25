package com.company.BusinessLogic;

import com.company.Interfaces.ForSale;
import com.company.model.Bouquet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class SaleManager {
    private LinkedHashMap<Client, ArrayList<Order>> salerecords;
    private List<ForSale> offercatalog;

    SaleManager(Order order) {
        salerecords = new LinkedHashMap<Client, ArrayList<Order>>();
    }

    void  showGoods() {
        for (var v : offercatalog) {
            System.out.println(v);
        }
    }

    int makeSale(Order order, Client client) {
        if (Order.getPrice >= Client.balance) {
            salerecords.computeIfAbsent(client, k -> new ArrayList<>()).add(order);

            return 0;
        } else {
            System.out.println("Not enough money on client balance!");
            return -1;
        }

    }


    public Bouquet createBoquet(Map<String, Integer> request) { //number of flower for any type
        return null;
    }

    public List<ForSale> getCatalog() {
        return offercatalog;
    }

    public void setCatalog(List<ForSale> catalog) {
        this.offercatalog = catalog;
    }


}
