import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

    Deck deckTest = new Deck();
    //These Values are for the Current Deck Values
    // If these Values where changed, the Unit test will Fail

    final int SUITS_TOTAL_SIZE = 4;
    final int TOTAL_CARDS_VALUE = 52;

    @Test
    public void isDeckBeingCreated(){

        Assert.assertNotNull(deckTest);
        Assert.assertTrue(deckTest.TotalCard() == TOTAL_CARDS_VALUE);
        Assert.assertTrue(deckTest.suitsSize() == SUITS_TOTAL_SIZE);

    }


    @Test
    public void doesDeckShuffleCorrectly(){
        String allDeck = deckTest.getAllCards();
        deckTest.shuffleCards();
        Assert.assertFalse(allDeck.equalsIgnoreCase(deckTest.getAllCards()));

    }

}
