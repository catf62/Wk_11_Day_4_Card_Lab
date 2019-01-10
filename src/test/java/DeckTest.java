import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void cardsStartAtZero(){
        assertEquals(0, deck.cardsCount());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.cardsCount());
    }

//    @Test
//    public void canShuffle(){
//        deck.populateDeck();
//        assertEquals(52, deck.cardsCount());
//        RankType unshuffledRank = deck.getCards().get(0).getRank();
//        deck.shuffle();
//        RankType shuffledRank = deck.getCards().get(0).getRank();
//        assertEquals(unshuffledRank, shuffledRank);
//    }

    @Test
    public void canRemoveCard(){
        deck.populateDeck();
        assertEquals(52, deck.cardsCount());
        deck.removeCard();
        assertEquals(51, deck.cardsCount());
    }

    @Test
    public void canGetTopCard(){
        deck.populateDeck();
        Card result = deck.getTopCard();
        assertEquals(1, result.getRank().getValue());
    }
    @Test
    public void canDealCard(){
        deck.populateDeck();
        Card card1 = deck.dealCard();
        assertEquals(51, deck.cardsCount());
        assertEquals(1, card1.getRank().getValue());
    }
}
