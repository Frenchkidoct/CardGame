public class Game {
        //create arraylists for ranks,suits,values
        private String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        private String [] ranks = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        private int [] points = {1, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        public void playGame() {
                Deck d = new Deck(ranks, suits, points);
        }

        public static void main(String[] args) {

                Game g = new Game();
                g.playGame();
        }


}
