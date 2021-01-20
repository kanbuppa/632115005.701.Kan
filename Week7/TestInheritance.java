package Week7;
//Kan buppaniroj 632115005
public class TestInheritance{
     public static void main(String[]args){
        Dog dog = new Dog("Bubu","Chihuahua","Brown, White",4);
        System.out.println("\nMy dog!!");
        dog.ShowPetData();
        dog.Run("jungle");
        dog.Bark("small");
        dog.isShortHair("short");

        Fish fish = new Fish("Nena","Ocellaris clownfish","Black, Orange, White",1);
        System.out.println("\nMy Fish!!");
        fish.ShowPetData();
        fish.Swimfast("small");
        fish.isSwimToSea("seawater");

        Bird bird = new Bird("Jubpa","Parrots","Colorful",2);
        System.out.println("\nMy bird!!");
        bird.ShowPetData();
        bird.Speak();
        bird.Checkcountry("Australia");
        bird.Iscanfly("yes");
     }
 }