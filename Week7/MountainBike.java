package Week7;
public class MountainBike extends SpeedBike{
    int gear;
     int input;
    
    public MountainBike(int speed){
        this.speed = speed;
    }
   
    public void GearUp(int gear){
        this.gear = gear;
        speed += gear*5;
    }
   
    public void GearDown(int gear) {
        this.gear = gear;
        speed -= 5*gear;
    }
}