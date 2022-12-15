import java.util.ArrayList;

public class player {
    //instance variable
    private String name;
    private int points;

    //arraylist for hand
    private ArrayList<Card> hand;

    public player(String name)
    {
        this.name = name;
        points = 0;
        hand = new ArrayList<Card>();
    }
    public player(String name, ArrayList<Card> hand)
    {
        this.name = name;
        this.hand = hand;
        points = 0;
        hand = new ArrayList<Card>();

    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addPoints(int points)
    {
        this.points += points;
    }
    public void addCard(Card card)
    {
        hand.add(card);
        points += card.getPoint();
    }
    public String toString()
    {
        return name + "has" + points + "points" + name + "'s card:" + hand;
    }
    public String toStringHand()
    {
        return name + "'s cards: " + hand;
    }

}
