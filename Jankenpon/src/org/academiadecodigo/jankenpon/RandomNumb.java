package org.academiadecodigo.jankenpon;

/**
 * Created by codecadet on 03/10/16.
 */
public class RandomNumb {

    public static int getNumber(int min, int max) {


        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;

    }
}
