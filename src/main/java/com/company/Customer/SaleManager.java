package com.company.Customer;

import com.company.Interfaces.ForSale;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SaleManager {
    private LinkedHashMap<Client, ArrayList<Order>> salerecords;


    SaleManager(Order order){
        salerecords=new LinkedHashMap<Client, ArrayList<Order>>();
    }

    int makeSale (Order order, Client client) {
        if (Order.calculatePrice >= Client.balance) {
            salerecords.computeIfAbsent(client, k-> new ArrayList<>()).add(order);
            return 0;
        } else {
            System.out.println("Not enough money on client balance!");
            return -1;
        }

    }


}
