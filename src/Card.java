public class Card {
        private String rank;
        private int point;
        private String suit;


    public Card(String rank, String suit, int point){
        this.rank = rank;
        this.point = point;
        this.suit = suit;
    }

    public Card() {

    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setColor(int point) {
        this.point = point;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getPoint() {
        return point;
    }
    public String toString(){
        return rank + "of" + suit;
    }
}
