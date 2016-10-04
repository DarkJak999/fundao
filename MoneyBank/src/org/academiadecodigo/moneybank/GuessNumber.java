package org.academiadecodigo.moneybank;

/**
 * Created by codecadet on 04/10/16.
 */
public class GuessNumber {

    public static double game(int playerNumber) {

        int houseNumber = RandomNumb.getNumberBetween(0, 100);
        double amount = RandomNumb.getNumberBetween(11, 100);

        if (playerNumber == houseNumber) {
            System.out.println("Congratulations! You won our game and you've won " + amount + " €");
            return amount;
        } else {
            System.out.println("Sorry but you lost :( better luck next time");
            return -10;
        }
    }
}

