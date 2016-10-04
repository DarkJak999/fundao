package org.academiadecodigo.calculator;

import java.util.Scanner;

/**
 * Created by João Lopes on 29/09/16.
 * <p>
 * This is a basic calculator class with the properties and methods needed for the 4 basic arithmetic operations
 */
public class Calculator {


    //Properties

    private int battery;


    /*********************************/

    //Gets ans Sets
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }


    /*********************************/


    //Methods
    public int sum(int number1, int number2) {

        return number1 + number2;
    }

    public int subtraction(int number1, int number2) {

        return number1 - number2;
    }

    public int multiplication(int number1, int number2) {

        return number1 * number2;
    }

    public float division(int number1, int number2) {

        return number1 / (float) number2;
    }

    public double squareRoot(int number) {

        return Math.sqrt(number);
    }

    public int powerOf(int base, int exp) {

        return (int) Math.pow(base, exp);
    }

    public double logBase10(int number) {

        return Math.log10(number);
    }

    public void decreseBattery() {

        int battery = getBattery();
        setBattery(battery - 1);
    }

    public void printMenu() {

        System.out.println("You sill have " + this.battery + " battery left\n" + "Choose your operation:\n1 - Sum\n2 - Subtract\n3 - Multiplication\n4 - Division\n5 - Square Root\n6 - Power of\n9 - Recharge Battery\n0 - Exit\n");
    }

    public int[] readNumbers() {
        Scanner input = new Scanner(System.in);
        int[] numberArray = new int[2];

        System.out.println("Input the first number");
        numberArray[0] = input.nextInt();
        System.out.println("Input the second number");
        numberArray[1] = input.nextInt();

        return numberArray;

    }

    public int readSingleNumber() {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Input the number");
        number = input.nextInt();

        return number;
    }

    public void bootCalc() {

        Scanner input = new Scanner(System.in);
        
        setBattery(10);

        int operation = -1;
        int[] numberArray;
        int number;


        while (operation != 0 && getBattery() > 0) {

            printMenu();
            operation = input.nextInt();

            switch (operation) {

                case 1:
                    numberArray = readNumbers();
                    System.out.println("Result: " + sum(numberArray[0], numberArray[1]));
                    decreseBattery();
                    break;
                case 2:
                    numberArray = readNumbers();
                    System.out.println("Result: " + subtraction(numberArray[0], numberArray[1]));
                    decreseBattery();
                    break;
                case 3:
                    numberArray = readNumbers();
                    System.out.println("Result: " + multiplication(numberArray[0], numberArray[1]));
                    decreseBattery();
                    break;
                case 4:
                    numberArray = readNumbers();
                    if (numberArray[1] != 0)
                        System.out.println("Result: " + division(numberArray[0], numberArray[1]));
                    else
                        System.out.println("You cannot divide by 0!");

                    decreseBattery();
                    break;
                case 5:
                    number = readSingleNumber();
                    System.out.println("The square root of " + number + " is: " + squareRoot(number));
                    decreseBattery();
                    break;
                case 6:
                    numberArray = readNumbers();
                    System.out.println("The power of " + numberArray[0] + " to the " + numberArray[1] + " is: " + powerOf(numberArray[0], numberArray[1]));
                    decreseBattery();
                    break;
                case 7:
                    number = readSingleNumber();
                    System.out.println("The log10 of " + number + " is:" + logBase10(number));
                    decreseBattery();
                    break;

                case 9:
                    setBattery(10);
                    System.out.println("Your battery as been charged!");
                    break;
                case 0:
                    System.out.println("Bye Bye!");
                    return;

                default:
                    System.out.println("That isn't a valid operation");
                    decreseBattery();
                    break;

            }

            System.out.println("\n");

            if (getBattery() == 0)
                System.out.println("You don't have any battery left");

        }


    }

}
