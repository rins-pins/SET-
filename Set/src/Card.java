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
    
}