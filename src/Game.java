
import java.util.Scanner;
public class Game {
        //create arraylists for ranks,suits,values
        private String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        private String [] ranks = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        private int [] points = {1, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        public static void main(String[] args) {
                Game g = new Game();
                g.playGame();
        }
        public void printInstructions()
        {
                System.out.println("Hello you. You will need to guess if the card you draw from the deck is \n" +
                        "more point values than the next one" + "If not express yourself");
        }
        public void playGame()
        {
                int pointCounter = 0;
                Deck d = new Deck(ranks, suits, points);
                printInstructions();
                System.out.println("Let the game begin. Say draw if you would like to get a card.");
                System.out.println("Say more if you think the next has a higher point value. Say less if not");
                Scanner input = new Scanner(System.in);
                String more = "more";
                String less = "less";
                more= input.nextLine();

                //this is as much as i was able to code within the deadline. I did finish all the classes though.
                while(pointCounter >= 0)
                {
                        if(more.equals("more"))
                        {
                                Card c1 = new Card();
                                System.out.println(c1);
                        }
                }




        }






}
