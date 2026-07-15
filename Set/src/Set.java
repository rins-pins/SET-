import java.util.ArrayList;

class Set {
        public static ArrayList<Card> Deck = new ArrayList<Card>();
        // legend: R = red, G = green, P = purple, O = oval, S= squiggle, D= diamond, F = filled, E= empty, L = lines
        public static boolean isASet(Card card1, Card card2, Card card3){
            boolean setState = true;
            
            if(!(card1.getNum() == card2.getNum()  && card1.getNum() == card3.getNum() || (card1.getNum() != card2.getNum()  && card1.getNum() != card3.getNum() && card2.getNum() != card3.getNum() ))){
                setState = false;
            }
            if(!(card1.getColor() == card2.getColor()  && card1.getColor() == card3.getColor() || (card1.getColor() != card2.getColor()  && card1.getColor() != card3.getColor() && card2.getColor() != card3.getColor() ))){
                setState = false;
            }
             if(!(card1.getShape() == card2.getShape()  && card1.getShape() == card3.getShape() || (card1.getShape() != card2.getShape()  && card1.getShape() != card3.getShape() && card2.getShape() != card3.getShape() ))){
                setState = false;
            }
            if(!(card1.getShading() == card2.getShading()  && card1.getShading() == card3.getShading() || (card1.getShading() != card2.getShading()  && card1.getShading() != card3.getShading() && card2.getShading() != card3.getShading() ))){
                setState = false;
            }

            return setState;
        }
        public static void createDeck(){
            for(int i= 0; i<3; i++){
                for(int j= 0; j<3; j++){
                    for(int k = 0; k <3; k++){
                        for(int l = 0; l<3; l++){
                            Card curr = new Card(i,j,k,l);
                            Deck.add(curr);
                        }
                    }
                }
            }
        }
        public static int createBigBoard(Card c1, Card c2){
            ArrayList<Card> board = new ArrayList<Card>();
            board.add(c1);
            board.add(c2);
            Deck.remove(c1);
            Deck.remove(c2);
            for (int i = 0; i < Deck.size(); i++){
                boolean isVal = true;
                Card curr = Deck.get(i);
                //check if the current card can make a set with any combination of the current cards
                for(int j = 0; j< board.size(); j++){
                    for(int k = 0; k<board.size(); k++){
                        // dont include the same card twice
                        if(k == j){
                            continue;
                        }
                        if(isASet(board.get(j),board.get(k),curr)){
                            isVal = false;
                        }
                    }
                }
                if(isVal){
                    board.add(curr);
                }
            }
            Deck.clear();
            createDeck();
            return board.size();
        }

        public static ArrayList<Card> createRandomBoard(int size){
            ArrayList<Card> board = new ArrayList<Card>();
            for(int i = 0; i < size; i++){
                int rand = (int)(Math.random() * Deck.size());
                board.add(Deck.get(rand));
                Deck.remove(rand);
            }
            return board;
        }


}