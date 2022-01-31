import java.util.Scanner;

public class elevens {

    private static final int NUMCARDS = 52;
    private final Deck<Card> deck;


//    public boolean isLegal(Card entry1, Card entry2) {
//        System.out.println("cock mate1");
//        System.out.println(entry1);
//        System.out.println(entry2);
//        if (deck.contains(entry1) && deck.contains(entry2)) {
//            System.out.println(entry1);
//            System.out.println(entry2);
//            System.out.println("cock mate");
//            return true;
//
//        } else {
//            System.out.println("not true la");
//            return false;
//        }
//
//    }
    public boolean pairSum11(Card card1,Card card2) {
        int num1 = card1.getRankValue();
        int num2 = card2.getRankValue();

        if

    }
    public elevens() {

        deck = new Deck<>();
        deck.deal();
        Scanner deckScanner = new Scanner(System.in);

        for(int i = 0; i < 9; i++) {
            System.out.println(i + 1 + ". " + deck.toArray()[i]);
        }
        System.out.println("----------");
        System.out.println("Cards left: " + deck.getCurrentSize());
        System.out.println("----------");
        System.out.println("Pick 2 cards using the corresponding numbers: ");
        int cardChoice1 = deckScanner.nextInt();
        int cardChoice2 = deckScanner.nextInt();

        Card deckInput1 = (Card) deck.toArray()[cardChoice1 - 1];
        Card deckInput2 = (Card) deck.toArray()[cardChoice2 - 1];

        if(isLegal(deckInput1, deckInput2)) {
            System.out.println("Hon the bais.");
        }
//        deck.removeElementAt(2);
//        deck.removeElementAt(7);
//
//
//        for(int i = 0; i < 9; i++) {
//            System.out.println(deck.toArray()[i]);
//        }
//        System.out.println("----------");
//        System.out.println(deck.getCurrentSize());
    }

    public static void main(String[] args){

        Scanner menuScanner = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Menu \n1.Play Game \n2.Exit \n---------------------------- ");

        String menuInput = menuScanner.nextLine();
        if  (menuInput.equals("1")) {
            elevens newGame = new elevens();

        }
        else if (menuInput.equals("2")) {
            System.exit(1);
        }

        }
    }


