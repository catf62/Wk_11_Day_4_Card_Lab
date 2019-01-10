import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int cardsCount(){
        return this.cards.size();
    }


    public void populateDeck(){
        for (SuitType suit : SuitType.values()) {
            for (RankType rank: RankType.values() ) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public void removeCard(){
        this.cards.remove(0);
    }
    public Card getTopCard(){
        return this.cards.get(0);
    }
    public Card dealCard(){
        Card card = this.getTopCard();
        this.removeCard();
        return card;
    }
}
