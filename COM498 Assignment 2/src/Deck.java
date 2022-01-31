import java.util.Random;

public class Deck<T> extends GameDeckBag<T>{
    private final int NUMCARDS = 52;
    private int cardIndex;

    public Deck() {
        for (int i = 0; i < NUMCARDS; i++) {

            Card card = new Card(i % 13, i / 13);
            //System.out.println(card);
            arrayList[i] = (T) card;
            numberOfEntries++;

        }
        this.cardIndex = NUMCARDS - 1;
        this.shuffleDeck();


    }

    public void shuffleDeck() {
        int index;
        Card temp;

        Random random = new Random();
        for (int i = 52 - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = (Card) arrayList[index];
            this.arrayList[index] = this.arrayList[i];
            this.arrayList[i] = (T) temp;
        }
    }

    public T deal() {
        return this.arrayList[this.cardIndex--];
    }
}
