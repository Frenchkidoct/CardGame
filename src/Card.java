public class Card {
        private int rank;
        private String color;
        private String suit;


    public Card(int rank, String color, String suit){
        this.rank = rank;
        this.color = color;
        this.suit = suit;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        return rank + "of" + suit;
    }
}