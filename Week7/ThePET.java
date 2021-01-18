package Week7;
    // KAN BUPPANIROJ 632115005
public class ThePET {


    String name;
    String species;
    String color;
    String pet;
    int age;
    String pet1,pet2, pet3;

    public ThePET() {
    }

    public ThePET(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
         System.out.println("My " + pet);
         System.out.println("Name: " + name + " Species: " + species + " Color: " + color + " Age :" + age);
         System.out.print("My " + pet + " " + name);
       
       
    }
}

class PetDog extends ThePET {
    String genre;
    public void pet(String pet){
this.pet=pet;
if (pet.equals("short")){
System.out.println("Short hair: True");}
else {
System.out.println("Short hair: False");}}
    public PetDog(String pet, String name, String species, String color, int age) {
    
        this.age = age;
        this.name = name;
        this.species = species;
        this.color = color;
        this.pet = pet;
    }
}
class PetFish extends ThePET {
    String genre;

	public PetFish(String pet,String name, String species, String color, int age) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.color = color;
        this.pet = pet;
    }
}
class PetBird extends ThePET {
    String genre;

	public PetBird(String pet,String name, String species, String color, int age) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.color = color;
        this.pet = pet;
    }
}
class Pet1 extends ThePET {

    String differentPet;

    public Pet1() {
    }

    public void DisplayPET() {
        System.out.println(" is "+differentPet);
    }
}

class Pet2 extends ThePET {
  
    String differentPet;
    public Pet2() {
    }

    public void DisplayPET() {
        System.out.println(differentPet);
    }
}

class Pet3 extends ThePET {
    String differentPet;

    public Pet3() {
    }

public void DisplayPET(){
    System.out.println(differentPet+": "  );

}


}

