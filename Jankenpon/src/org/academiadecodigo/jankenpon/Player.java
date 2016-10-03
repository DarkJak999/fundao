package org.academiadecodigo.jankenpon;

/**
 * Created by codecadet on 03/10/16.
 */
public class Player {

    private int move; //this is gonna take the ordinal value of the enum Move
    private int numberOfWins;

    Player(int numberOfWins){
        this.numberOfWins = numberOfWins;
    }

    //SETS

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public void setMove(int move) {
        this.move = move;
    }

    //GETS

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getMove() {
        return move;
    }


    //METHODS

}
