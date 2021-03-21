package Week12;
// kan buppaniroj 632115005
public class Triangle extends Shape{
     private double base;
     private double height;

     public Triangle(double base,double height){
         this.base = base;
         this.height = height;
     }

     @Override
     public void getArea(){
         double area;
         area = base*height/2;
         System.out.println("Area of Triangle is "+area);
     }
 }
