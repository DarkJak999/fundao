package org.academiadecodigo.calculator;

import java.util.Scanner;

/**
 * Created by João Lopes on 29/09/16.
 * This is the main function to call out and use the basic calculator class
 */
public class main {

    private static int battery = 10;

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        calculator.battery = battery;

        int operation = -1;
        int[] numberArray = new int[2];


        while (operation != 0 && calculator.battery > 0) {

            calculator.printMenu();
            operation = input.nextInt();

            switch (operation) {

                case 1:
                    numberArray = calculator.readNumbers();
                    System.out.println("Result: " + calculator.sum(numberArray[0], numberArray[1]));
                    calculator.battery--;
                    break;
                case 2:
                    numberArray = calculator.readNumbers();
                    System.out.println("Result: " + calculator.subtraction(numberArray[0], numberArray[1]));
                    calculator.battery--;
                    break;
                case 3:
                    numberArray = calculator.readNumbers();
                    System.out.println("Result: " + calculator.multiplication(numberArray[0], numberArray[1]));
                    calculator.battery--;
                    break;
                case 4:
                    numberArray = calculator.readNumbers();
                    if (numberArray[1] != 0)
                        System.out.println("Result: " + calculator.division(numberArray[0], numberArray[1]));
                    else
                        System.out.println("You cannot divide by 0!");

                    calculator.battery--;
                    break;
                case 5:
                    //System.out.println(calculator.battery);
                    calculator.battery = battery;
                    //System.out.println(calculator.battery);
                    break;
                case 0:
                    System.out.println("Bye Bye!");
                    return;

                default:
                    System.out.println("That isn't a valid operation");
                    calculator.battery--;
                    break;

            }

            System.out.println("\n");

            if(calculator.battery == 0)
                System.out.println("You don't have any battery left");

        }


    }
}
