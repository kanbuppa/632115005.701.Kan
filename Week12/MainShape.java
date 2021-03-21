package Week12;
// kan buppaniroj 632115005
public class MainShape {
     public static void main(String[]args){
          Shape circle = new Circle(14);
         circle.getArea();

         Shape parallelogram = new Parallelogram(20,5);
         parallelogram.getArea();
         
         Shape triangle = new Triangle(12,20);
         triangle.getArea();
        
       

     }
 }