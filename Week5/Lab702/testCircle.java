package Week5.Lab702;

public class testCircle {
    public static  void main(String[] args) {
        Circle circle1= new Circle(2.0,0.0,0.0);
    System.out.println("Area of cir1 : "+circle1.getArea());
    System.out.println("Circumference of cir1 :" +circle1.getCircumference());
        Circle circle2= new Circle(3.0,1.0,2.0);
        System.out.println("Area of cir2 : "+ circle2.getArea());
        System.out.println("Circumference of cir2 :"+circle2.getCircumference());
        Circle circle3= new Circle(1.0,3.0,5.0);
        System.out.println("Area of cir3 : "+ circle3.getArea());
        System.out.println("Circumference of cir3 :"+circle3.getCircumference());
    Circle circle4= new Circle(-1.0,-1.0,-10.0);
        System.out.println("Area of cir4 : "+circle4.getArea());
        System.out.println("Circumference of cir4 :"+circle4.getCircumference());
        System.out.println("Does cir1 intersect with cir2: "+Circle.getIntersect(circle1,circle2));
        System.out.println("Does cir1 intersect with cir3: " +Circle.getIntersect(circle1,circle3));
}}
