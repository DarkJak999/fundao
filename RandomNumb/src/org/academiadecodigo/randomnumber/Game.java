package org.academiadecodigo.randomnumber;

/**
 * Created by codecadet on 03/10/16.
 */
public class Game {

    private int houseNumber;


    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void chooseNumber(int min, int max) {

        int number = RandomNumb.getRandom(min, max);
        setHouseNumber(number);

    }

    public boolean compare(int playerNum, int houseNum) {

        if (playerNum == houseNum)
            return true;
        return false;

    }

    public void startGame(Player player1, Player player2, int max, int min) {

        boolean gameStatus = false;
        int count = 1; //number of rounds until there is a winner

        chooseNumber(min, max); //let's pick the house number
        player1.makeAGuess(min, max);
        player2.makeAGuess(min, max);

        //System.out.println("Player: " + player.getPlayerNum());
        //System.out.println("House: " + getHouseNumber());

        System.out.println("Round 1... Fight!");
        while (!gameStatus) {
            //while there isn't a winner the game goes on


            //the players can't have the same number
            while (player1.getPlayerNum() == player2.getPlayerNum()) {
                player1.makeAGuess(min, max);
                player2.makeAGuess(min, max);
            }


            if (compare(player1.getPlayerNum(), houseNumber)) {
                gameStatus = true;
                System.out.println("The player " + player1.getName() + " is the winner after " + count + " rounds with the number " + player1.getPlayerNum());
            }
            else if(compare(player2.getPlayerNum(), houseNumber)){
                gameStatus = true;
                System.out.println("The player " + player2.getName() + " is the winner after " + count + " rounds with the number " + player2.getPlayerNum());
            }
            else {
                System.out.println("Round " + (count+1) + "... Fight!");
                player1.makeAGuess(min, max);
                player2.makeAGuess(min,max);
            }

            count++;
        }

    }

}
