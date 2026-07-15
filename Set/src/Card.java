class Card{
    private int num;
    private int color, shape, shading;
    public Card(int num, int color, int shape, int shading){
        this.num = num;
        this.color = color;
        this.shape = shape;
        this.shading = shading;
    }
    
    public int getNum(){
        return num;
    }
    public int getColor(){
        return color;
    }
    public int getShape(){
        return shape;
    }
    public int getShading(){
        return shading;
    }
    public String toString(){
        String colorString = "";
        String shapeString = "";
        String shadingString = "";
        if(color == 0){
            colorString = "Red";
        }
        else if(color == 1){
            colorString = "Green";
        }
        else{
            colorString = "Purple";
        }
        if(shape == 0){
            shapeString = "Oval";
        }
        else if(shape == 1){
            shapeString = "Squiggle";
        }
        else{
            shapeString = "Diamond";
        }
        if(shading == 0){
            shadingString = "Filled";
        }
        else if(shading == 1){
            shadingString = "Empty";
        }
        else{
            shadingString = "Lines";
        }
        return " Num: " + (num+1) + ", Color: " + colorString + ", Shape: " + shapeString + ", Shading: " + shadingString + "\n";

    }
    
}
