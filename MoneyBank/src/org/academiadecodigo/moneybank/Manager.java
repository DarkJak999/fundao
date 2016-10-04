package org.academiadecodigo.moneybank;
import java.util.Scanner;

/**
 * Created by codecadet on 04/10/16.
 */
public class Manager {

    public void moneyManager(Person person) {

        Scanner input = new Scanner(System.in);

        Actions option;
        String spend;
        int hours, playerNumber;
        double amount;

        while (true) {
            try {
                printMenu();
                option = Actions.valueOf(input.nextLine().toUpperCase());
                //pick an action
            } catch (IllegalArgumentException e) {
                System.out.println("That's not a valid choice, please pick another option");
                printMenu();
                option = Actions.valueOf(input.nextLine().toUpperCase());
            }


            switch (option) {
                case WORK:
                    //WORK - gives more money
                    System.out.println("You make 10€ per hour. How many hours do you want to work? (Max 8 hours");
                    hours = input.nextInt();
                    person.workThisMuch(hours);
                    break;

                case SPEND:
                    //SPEND - spends money
                    amount = RandomNumb.getRandom(30);
                    System.out.println("This is where you pay your bills! You have to pay " + amount + " €\nDo you want to pay cash or credit?");
                    person.printHowMuchMoney();
                    spend = input.nextLine().toUpperCase();
                    person.paymentMethod(spend, amount);
                    break;

                case FUN:
                    //FUN - Can either win or lose money
                    System.out.println("Welcome to our casino! The game is guess a number between 1 and 100. Make your pick");
                    playerNumber = input.nextInt();
                    amount = GuessNumber.game(playerNumber);
                    person.increaseWallet(amount);
                    break;

                case SLEEP:
                    System.out.println("Ok, bye bye");
                    return;

                default:
                    System.out.println("You shouldn't be here");
                    break;

            }
        }
    }

    public void printMenu() {
        System.out.println("Pick a menu:\nWork\nSpend\nFun\nSleep\n");
    }
}
