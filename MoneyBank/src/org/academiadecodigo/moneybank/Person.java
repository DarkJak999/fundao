package org.academiadecodigo.moneybank;

/**
 * Created by codecadet on 04/10/16.
 */
public class Person {

    //Properties

    private String name;
    private Bank account;
    private Wallet wallet;


    //Constructors
    Person() {


    }

    Person(String name, double bankValue, double walletValue) {

        this.name = name;
        this.account = new Bank(name, bankValue);
        this.wallet = new Wallet(name, walletValue);
    }

    //Gets and Sets


    public String getName() {
        return name;
    }

    public Bank getAccount() {
        return account;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Bank account) {
        this.account = account;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    //Methods

    public void increaseWallet(double amount) {

        //no protection needed, this only increases the amount of money in the wallet
        this.wallet.increaseAmount(amount);
    }

    public void increaseAccount(double amount) {
        //first we need to check if there's money in the wallet

        if (this.wallet.getAmount() > 10.0) {
            this.account.increaseAmount(amount);
            this.wallet.decreseAmount(amount);
        } else {
            System.out.println("You don't have enough money for a deposit");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account owner: " + this.account.getOwner());
        System.out.println("Account amount: " + this.account.getAmount() + " €");
    }

    public void printWalletDetails() {
        System.out.println("Wallet owner: " + this.wallet.getId());
        System.out.println("Wallet amount: " + this.wallet.getAmount() + " €");
    }

    public void printHowMuchMoney(){
        System.out.println("You have " + this.wallet.getAmount() + " € in your wallet and " + this.account.getAmount() + " € in your account");
    }

    public void paymentMethod(String option, double amount) {

        if (option.compareTo("CARD") == 0) {
            if (checkAccount(amount)) {
                this.account.decreseAmount(amount);
                System.out.println("You have paid with your credit card and you have " + this.account.getAmount() + " € left in your account");
            } else
                System.out.println("You don't have enough money on your account...");
        } else if (option.compareTo("CASH") == 0) {
            if (checkWallet(amount)) {
                this.wallet.decreseAmount(amount);
                System.out.println("You have paid with cash and you have " + this.wallet.getAmount() + " € left in your wallet");
            }
            else
                System.out.println("You don't have enough money on your wallet...");
        }
    }

    public boolean checkAccount(double amount) {

        if (this.account.getAmount() > amount)
            return true;
        return false;
    }

    public boolean checkWallet(double amount) {

        if (this.wallet.getAmount() > amount)
            return true;
        return false;
    }

    public void workThisMuch(int hours) {

        double amount;

        if (hours < 1 || hours > 8) {
            System.out.println("You can't work those hours!");
            return;
        } else {
            amount = hours * 10;
            increaseWallet(amount);
            System.out.println("You worked for " + hours + " hours and made " + amount + " €");
        }
    }

}
