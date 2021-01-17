package Week5.Lab702;

public class Circle {    private double radius = 1;
    private double i = 0.0;
    private double j = 0.0;
    public Circle(){}
    public Circle (double newRadius, double i, double j){
        radius = newRadius ;
        this.i=i;
        this.j=j;
    }


    public static boolean getIntersect(Circle circle1, Circle circle2) {
        double distSQ = 0;
        distSQ = (circle1.i-circle2.i) * (circle1.i-circle2.i) + (circle1.j-circle2.j) * (circle1.j-circle2.j);
        double radSumSQ = 0;
        radSumSQ= (circle1.radius+circle2.radius) * (circle1.radius+circle2.radius);
        if (distSQ > radSumSQ) {
            return false;}
        else{
            return true;}}


    public double getCircumference() {
        if(radius<0){

        return 0.0;}
    else{
        return 2.0 * radius * Math.PI;}}

    public double getArea() { if(radius<0){

        return 0.0;}
    else{
        return radius * radius * Math.PI;}}
    }
