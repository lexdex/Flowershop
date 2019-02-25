package com.company.BusinessLogic;

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



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
