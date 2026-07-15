import java.util.ArrayList;

public class App extends Set {
    public static void main(String[] args) throws Exception {
        
        // legend: 
        //  0 = red, 1 = green, 2 = purple
        //  0 = oval, 1 = squiggle, 2 = diamond
        //  0 = filled, 1 = empty, 2 = lines

        // a deck is a full deck of 81 cards
        // a set is any 3 cards that form a set
        // a board is any amount of cards selected from the deck

        System.out.println("Hello, Set lovers!");
        Card card1 = new Card(2,2,2,2);
        Card card2 = new Card(1,0,2,2);
        Card card3 = new Card(0,1,2,2);
        System.out.println(isASet(card1,card2,card3));
        createDeck();
        int biggest = 0;
        Card sC1 = new Card(1,1,1,1);
        Card sC2 = new Card(1,1,1,1);
         for(int i = 0; i < 81; i++){
            for(int j = 0; j < 81; j++){
                if(i==j){
                    continue;
                    //to not start with the same two cards
                }
                int curr = createBoard(Deck.get(i),Deck.get(j));
                if(curr >= biggest){
                    biggest = curr;
                    sC1 = Deck.get(i);
                    sC2 = Deck.get(j);
                }

            }
        }
        System.out.println("Biggest size is " + biggest + ", starting with cards: " + sC1 + " and " + sC2 );
    }
}
