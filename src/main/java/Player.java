import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.hand = new ArrayList<>();
        this.name = name;
    }

    public int countCards(){
        return this.hand.size();
    }

    public Card showHand(){
        return this.hand.get(0);
    }
}
