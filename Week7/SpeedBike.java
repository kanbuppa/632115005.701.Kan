package Week7;

public class SpeedBike{
    int speed;

    public SpeedBike(){}
    public SpeedBike(int speed){
        this.speed = speed;
    }
 
    public void CheckSpeed() {
        System.out.println("Current Speed: " + speed + " km/h");

    }
     public void Line(){
         System.out.println("");
     }
}
