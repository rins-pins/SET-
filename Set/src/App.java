public class App extends Set {
    public static void main(String[] args) throws Exception {
        
        // legend: 
        //  1 = red, 2 = green, 3 = purple
        //  1 = oval, 2 = squiggle, 3 = diamond
        //  1 = filled, 2 = empty, 3 = lines

        System.out.println("Hello, Set lovers!");
        Card card1 = new Card(3,3,3,3);
        Card card2 = new Card(2,1,3,3);
        Card card3 = new Card(1,2,3,3);
        System.out.println(isASet(card1,card2,card3));
        createDeck();
        
    }
}
