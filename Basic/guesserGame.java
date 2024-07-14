import java.util.Scanner;
/**
 * This is a documenation at the beginning of the class.
 * This class contains methods for guessing and predicting numbers from Guesser.
 * @since 2024-06-24
 * @author  Awadh Kishor Singh
 * @version 1.0
 */
class guesser{
    int gnum;
    int guessingNum(){
        System.out.println("Guesser! guess a Number : ");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}
/**
 * This class contains method for guesssing number from players of the game
 * 
 *  */
class player{
    int pnum;
    int predictingNum()
    {
        System.out.println("Player! predict the Number : ");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }
}
/**
 * This class contains the  game logic
 * This class holds the power of  collecting numbers from Guesser and players
 */
class umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectingNumFromGuesser(){
        guesser g = new guesser();
        numFromGuesser = g.guessingNum();

    }

    void collectingNumFromPlayers(){
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numFromPlayer1 = p1.predictingNum();
        numFromPlayer2 = p2.predictingNum();
        numFromPlayer3 = p3.predictingNum();
    }

    void comparing()
    {
        if(numFromPlayer1==numFromGuesser){
            System.out.println("Player 1 is winner");
        }
        if (numFromPlayer2==numFromGuesser){
            System.out.println("Player 1 is winner");
        }
        if(numFromPlayer3==numFromGuesser)
        {
            System.out.println("Player 3 is winner");
        }
    }

}

/**
 * This is the main class where the game starts
 * This class contains the main method and game logic
 *  @since 2024-06-24
 * @author  Awadh Kishor Singh
 * @version 1.0
 */
public class guesserGame {
    static public void main(String [] args){
        umpire u = new umpire();
        u.collectingNumFromGuesser();
        u.collectingNumFromPlayers();
        u.comparing();

    }

    
}