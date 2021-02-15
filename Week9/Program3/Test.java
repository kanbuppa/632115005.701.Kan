package Week9.Program3;
// Kan Buppaniroj 632115005
public class Test {
   
    public static void main(String[]args){

       
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        
        Rectangle shape2 = new Rectangle(15, 40);
        System.out.println(shape2.toString());

        Cube shape3 = new Cube(15, 24, 10);
        System.out.println(shape3.toString());
    }
} 

