package Week9.Program3;
class Cube extends Rectangle{
    private int length;

    public Cube(int width, int height, int length){
        super(width, height);
        this.length = length;
    }
    @Override
    public String toString(){
        return "This is a cube with the side of "+length;
    }
}