package org.academiadecodigo.jankenpon;

/**
 * Created by codecadet on 03/10/16.
 */
public class RandomNumb {

    private static int getNumber(int min, int max) {

        //This is to be inclusive with the max range | ((max - min) + 1 )

        return (int) ((Math.random() * ((max - min) + 1 )) + min);

    }

    public static int generateInt(int max){

        return getNumber(0, max);
    }


    /*

    public static int generateBetween(int min, int max){

        return getNumber(min, max);
    }
    */
}
