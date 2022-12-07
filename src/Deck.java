import java.util.ArrayList;
public class Deck
{

    //instance variable for cards left
    private int cardsLeft;

    //array for cards
   private ArrayList<Card> deck;

    public Deck(String [] ranks, String [] suits, int [] points )
    {
        deck = new ArrayList<Card>();
        // create cards and add them to deck
        for(int i = 0; i < ranks.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                Card c = new Card (ranks[i], suits[j],points[i]);
                deck.add(c);
            }
        }
        cardsLeft = deck.size();
    }
    public boolean isEmpty()
    {
        if(cardsLeft == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getCardsLeft()
    {
        return cardsLeft;
    }
    public Card deal()
    {
        if(this.isEmpty() == true)
        {
            return null;
        }
        else
        {

        }
    }

}
