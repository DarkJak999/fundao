package org.academiadecodigo.jankenpon;

/**
 * Created by codecadet on 03/10/16.
 */
public class Game {


    public void letsPlay(Player p1, Player p2, int rounds) {

        //this is the main function where the game will be played out

        int count = 0;

        p1.resetWins();
        p2.resetWins();

        if(rounds % 2 == 0){
            System.out.println("You can't have a even number of rounds - Ties are not allowed! We'll take care of that for you");
            rounds++;
        }

        while (count < rounds) {

            //player1 pick move
            p1.setMove(pickAMove());

            //player2 pick move
            p2.setMove(pickAMove());

            //compare moves for ties
            while (p1.getMove() == p2.getMove()) {
                p1.setMove(pickAMove());
                p2.setMove(pickAMove());
            }

            //decide winner
            //rock > scissors | scissors > paper | paper > rock
            if ((p1.getMove() == 0 && p2.getMove() == 1) || (p1.getMove() == 1 && p2.getMove() == 2) || (p1.getMove() == 2 && p2.getMove() == 0)) {
                p1.increaseWins();
                //System.out.println("player1 win");
            }
            else
                p2.increaseWins();



            if (p1.getNumberOfWins() > (rounds / 2)) {
                System.out.println("Player 1 already won half the rounds");
                break;
            } else if (p2.getNumberOfWins() > (rounds / 2)) {
                System.out.println("Player 2 already won half the rounds");
                break;
            }

            count++;

        }

        if (p1.getNumberOfWins() > p2.getNumberOfWins()) {
            System.out.println("Player 1 is the winner with " + p1.getNumberOfWins() + " wins to " + p2.getNumberOfWins());
        } else {
            System.out.println("Player 2 is the winner with " + p2.getNumberOfWins() + " wins to " + p1.getNumberOfWins());
        }
    }

    public int pickAMove() {

        int number = RandomNumb.generateInt(2);

        //System.out.println(number);

        if (number == Move.ROCK.ordinal()) {
            return Move.ROCK.ordinal();
        } else if (number == Move.PAPER.ordinal()) {
            return Move.PAPER.ordinal();
        } else
            return Move.SCISSOR.ordinal();


    }

}
