package org.academiadecodigo.moneybank;

/**
 * Created by codecadet on 04/10/16.
 */
public class RandomNumb {


    public static double getRandom(int max) {

        //This is to be inclusive with the max range | ((max - min) + 1 )

        return ((Math.random() * max));

    }


    public static int getNumberBetween(int min, int max) {

        //This is to be inclusive with the max range | ((max - min) + 1 )

        return (int) ((Math.random() * ((max - min) + 1 )) + min);

    }

}
