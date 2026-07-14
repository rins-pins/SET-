import java.util.ArrayList;

class Set {
        static ArrayList<Card> Deck = new ArrayList<Card>();
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
            System.out.println("Deck Created! Total length: " + Deck.size());
        }

}