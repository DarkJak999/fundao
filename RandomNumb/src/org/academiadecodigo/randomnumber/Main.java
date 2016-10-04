package org.academiadecodigo.randomnumber;

/**
 * Created by codecadet on 03/10/16.
 */
public class Main {

    public static void main(String[] args) {


        //Initialize players for the game

        Player p1 = new Player("Hiro");
        Player p2 = new Player("Some1");
        Game letsPlay = new Game();

        //Start the game

        letsPlay.startGame(p1, p2, 1 , 25);

    }
}
