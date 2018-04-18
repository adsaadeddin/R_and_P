import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * This Deck provides the Standard 4 Suites Card Game
 * Which can be used into Future Games Engine.
 * The developer used the Standards Symbols :
 * spade : ♠, club : ♣, heart : ♥, Diamond : ♦
 *
 */
public class Deck {


    private ArrayList<String> cards;
    final private int NUMBER_OF_CARDS_IN_EACH_SUIT = 13;
    final private String[] suits = new String[] {"♠", "♣", "♥", "♦"};

    final private String ACE = "A";
    final private String KING = "K";
    final private String QUEEN = "Q";
    final private String JACK = "J";


    public Deck() {
        cards = new ArrayList<String>();

        for(int i=0; i < suitsSize(); i++){

            cards.add(ACE + "_" + suits[i]);
            cards.add(JACK + "_" + suits[i]);
            cards.add(QUEEN + "_" + suits[i]);
            cards.add(KING + "_" + suits[i]);

            for(int j=2; j<11; j++){
                cards.add(j + "_" + suits[i]);
            }
        }

    }

    /**
     *
     * This Method can work as a Print All Method
     * The Method Will print All the Cards in a 13 cards format
     * so for 4 players game, it will show up 13 for each.
     */
    public void dealAllCards(){
        for (int i = 0; i < cards.size(); i++) {
            if((i+1)% NUMBER_OF_CARDS_IN_EACH_SUIT == 0){
                System.out.println(cards.get(i));
            }else {
                System.out.print(cards.get(i) + " ");
            }
        }
    }


    public void shuffleCards(){
        Collections.shuffle(cards);
        System.out.println("Card shuffling is successful");
    }

    public String dealARandomCard(){
        Random rand = new Random();
        return cards.get(rand.nextInt(cards.size()) + 1);
    }


    public String dealTheHeadCard() {
        return cards.get(0);
    }

    public String dealTheTailCard() {
        return cards.get(cards.size()-1);
    }


    public int TotalCard() {
        return cards.size();
    }

    public int suitsSize() {
        return suits.length;
    }

    public String getAllCards(){
        return cards.toString();
    }
}
