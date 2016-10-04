package org.academiadecodigo.moneybank;

/**
 * Created by codecadet on 04/10/16.
 */
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Joao", 200.0, 20.0);

        Manager lifeManager = new Manager();

        lifeManager.moneyManager(p1);

        /*
        System.out.println(p1.getName());
        p1.printAccountDetails();
        p1.printWalletDetails();

        p1.increaseWallet(10);
        p1.printWalletDetails();
        p1.increaseAccount(20);

        p1.printAccountDetails();
        p1.printWalletDetails();
        */
    }
}
