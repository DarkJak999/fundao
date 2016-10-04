package org.academiadecodigo.randomnumber;

/**
 * Created by codecadet on 03/10/16.
 */
public class RandomNumb {

    public static int getRandom(int min, int max){

        return (int)(Math.random() * (max - min) + min);

    }
}
