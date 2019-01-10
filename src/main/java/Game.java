import java.util.ArrayList;

public class Game {
    private Deck deck;
    private ArrayList<Player> players;

    public Game (){
        deck = new Deck();
        deck.populateDeck();
        players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

}
