package com.company.Customer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SaleRecords {

    private LinkedHashMap <Client,ArrayList<Order>> salerecords;


    public SaleRecords(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
}
