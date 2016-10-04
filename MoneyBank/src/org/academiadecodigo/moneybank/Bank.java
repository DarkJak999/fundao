package org.academiadecodigo.moneybank;

/**
 * Created by codecadet on 04/10/16.
 */
public class Bank {

    //Properties

    private String owner;
    private double amount;

    //Constructors

    Bank(){


    }

    Bank(String owner, double amount){
        this.owner = owner;
        this.amount = amount;
    }

    //Gets and Sets


    public double getAmount() {
        return amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //Methods
    public void increaseAmount(double amount){
        this.amount += amount;
    }

    public void decreseAmount(double amount){
        this.amount -= amount;
    }
}