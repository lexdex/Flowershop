package com.company.BusinessLogic;

import com.company.Interfaces.ForSale;

import java.util.LinkedHashMap;
import java.util.Map;

public class Order {
    int id;
    Client customer;
    Payment payment;
    private LinkedHashMap<Client, ForSale> orderlist;

    Order() {
    }

    public void addOrder(Client client,ForSale forsale){
        orderlist.put(client,forsale);
    }

    public void removeOrder(Client client,ForSale forsale){
        orderlist.remove(client,forsale);
    }


    public int getFullPrice() {
        int counter = 0;
        for (Map.Entry<Client, ForSale> entry : orderlist.entrySet()) {
            counter += entry.getValue().getPrice();
        }
        return counter;
    }



}








