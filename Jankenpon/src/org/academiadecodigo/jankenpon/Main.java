package org.academiadecodigo.jankenpon;

/**
 * Created by codecadet on 03/10/16.
 */
public class Main {


    public static void main(String[] args) {

        Player p1 = new Player(0);
        Player p2 = new Player(0);

        Game game = new Game();

        game.letsPlay(p1, p2, 5);
    }
}
