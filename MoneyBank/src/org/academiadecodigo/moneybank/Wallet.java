package org.academiadecodigo.moneybank;

/**
 * Created by codecadet on 04/10/16.
 */
public class Wallet {

    //Properties

    private String id;
    private double amount;

    //Constructors

    Wallet(){

    }

    Wallet(String id, double amount){
        this.id = id;
        this.amount = amount;
    }

    //Gets and Sets


    public double getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Methods

    public void increaseAmount(double amount){
        this.amount += amount;
    }

    public void decreseAmount(double amount){
        this.amount -= amount;
    }
}

