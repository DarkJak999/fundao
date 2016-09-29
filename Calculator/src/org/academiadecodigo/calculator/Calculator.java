package org.academiadecodigo.calculator;

import java.util.Scanner;

/**
 * Created by João Lopes on 29/09/16.
 * <p>
 * This is a basic calculator class with the properties and methods needed for the 4 basic arithmetic operations
 */
public class Calculator {


    //Properties

    public int battery;


    /*********************************/


    //Methods

    public int sum(int number1, int number2){

        return number1 + number2;
    }

    public int subtraction(int number1, int number2){

        return number1 - number2;
    }

    public int multiplication(int number1, int number2){

        return number1 * number2;
    }

    public float division(int number1, int number2){

        return (float)number1 / (float)number2;
    }

    public void printMenu(){

        System.out.println("You sill have " + this.battery + " battery left\n" + "Choose your operation:\n1 - Sum\n2 - Subtract\n3 - Multiplication\n4 - Division\n5 - Recharge Battery\n0 - Exit\n");
    }

    public int[] readNumbers(){
        Scanner input = new Scanner(System.in);
        int[] numberArray = new int[2];

        System.out.println("Input the first number");
        numberArray[0] = input.nextInt();
        System.out.println("Input the second number");
        numberArray[1] = input.nextInt();

        return numberArray;

    }

}
