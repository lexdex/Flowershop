package com.company.Customer;

public class Client {

    public int Id;
    public int balance;
    public String Name;
    public String Surname;
    public Payment payment;


    public Client(){}


    public Client(int id, int balance, String name, String surname, Payment payment) {
        Id = id;
        this.balance = balance;
        Name = name;
        Surname = surname;
        this.payment = payment;
    }





}
