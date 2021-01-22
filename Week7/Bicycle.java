package Week7;
public class Bicycle extends SpeedBike{
    int gear;
    public Bicycle(int speed){
        this.speed = speed;
    }
    
    public void SpeedUp(int gear) {
         this.gear = gear;
        speed += 5*gear;
    }
  
    public void SpeedDown(int gear) {
        this.gear = gear;
        speed -= 5*gear;
    }
}