package Week9.Program3;

class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString(){
        return "This is a rectangle with width as "+width+" the height as "+height;
    }
}
