package com.company.Customer;

import com.company.Interfaces.ForSale;

import java.util.LinkedHashMap;

public class Order {
    int     id;
    Client customer;
    Payment payment;
    private LinkedHashMap <Client, ForSale> orderlist;



    Order(){}

    int calculatePrice(){
       int price=0;
        for (var list: orderlist){
           price+=list;
       }
        return price;
    }







}
