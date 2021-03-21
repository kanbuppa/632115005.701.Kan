package Week12;
// kan buppaniroj 632115005
public class Circle extends Shape{
     private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }
     
     @Override
     public void getArea(){
         double area;
         area = Math.PI*(Math.pow(radius, 2));
         System.out.println("Area of Circle is "+area);
     }
 }