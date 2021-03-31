package Week4;
public class Circle {
    private double radius =1;
    private static int numberOfOjects = 0;
   private static String Color;
public Circle() {
numberOfOjects++;}
public Circle(double newRadius){
radius = newRadius;
numberOfOjects++;}
public double getRadius() {
return radius;}
public void setRadius(double newRadius) {
radius = (newRadius >= 0) ? newRadius : 0;}
public static int getNumberOfObjects() {
return numberOfOjects;}
public static void setNumberOfObject(int number){
numberOfOjects = number;}
public double getArea() {
return radius * radius * Math.PI;}
public static String getColor() {
    return Color;}
    public static void setColor(String color ){
        Color = color;}

}