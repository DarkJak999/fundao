package org.academiadecodigo.randomnumber;

/**
 * Created by codecadet on 03/10/16.
 */
public class Player {

    private String name;
    private int playerNum;

    Player(String name){

        this.name = name;
    }


    public void setPlayerNum(int playerNum) {

        this.playerNum = playerNum;
    }

    public int getPlayerNum() {

        return playerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void makeAGuess(int min, int max){

        //randomize a number for the player
        setPlayerNum(RandomNumb.getRandom(min, max));
    }
}
