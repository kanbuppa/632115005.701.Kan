package Week12;
// kan buppaniroj 632115005
public class Parallelogram extends Shape{
     private double base;
     private double height;

     public Parallelogram(double base, double height){
         this.base = base;
         this.height = height;
     }
     @Override
     public void getArea(){
         double area;
         area = base*height;
         System.out.println("Area of Parallelogram is "+area);
     }
 }