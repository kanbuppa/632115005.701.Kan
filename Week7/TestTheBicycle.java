package Week7;
public class TestTheBicycle {
    public static void main(String[]args){
        Bicycle bicycle = new Bicycle(10);
                System.out.println("Bicycle");
            bicycle.CheckSpeed();
            bicycle.Line();
                System.out.println("Bicycle speeds up 1 time.");
            bicycle.SpeedUp(1);
            bicycle.CheckSpeed();
            bicycle.Line();
                System.out.println("Bicycle speeds up 4 time.");
            bicycle.SpeedUp(4);
            bicycle.CheckSpeed();
            bicycle.Line();
                System.out.println("Bicycle brakes 1 time.");
            bicycle.SpeedDown(1);
            bicycle.CheckSpeed();
            bicycle.Line();
                System.out.println("Bicycle brakes 5 time.");
            bicycle.SpeedDown(5);
            bicycle.CheckSpeed();
            bicycle.Line();
                System.out.println("----------------");
       

        MountainBike mountainbike = new MountainBike(10);
            mountainbike.Line();
                System.out.println("Mountain Bike");
            mountainbike.CheckSpeed();
            mountainbike.Line();
                System.out.println("Mountain Bike up to  gear 2.");
            mountainbike.GearUp(2);
            mountainbike.CheckSpeed();
            mountainbike.Line();
                System.out.println("Mountain Bike up to gear 5.");
            mountainbike.GearUp(3);
            mountainbike.CheckSpeed();
            mountainbike.Line();
                System.out.println("Mountain Bike brakes 4 time.");
            mountainbike.GearDown(4);
            mountainbike.CheckSpeed();
   
    }
}