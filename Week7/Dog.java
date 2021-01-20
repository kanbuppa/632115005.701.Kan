package Week7;
//Kan buppaniroj 632115005
public class Dog extends Pets{
    String size;
    String hair;
    String run;

   
    public Dog(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    
    public void Run(String run){
        this.run = run;
        System.out.println("My dog name is "+name+" runs to the "+run+".");
    }
   
    public void Bark(String size){
        this.size = size;
        if(size.equals("small")){
            System.out.println(size+" bark BOX BOX!");
        }
        else if(size.equals("medium")){
            System.out.println(size+" bark Woof Woof!!");
        }
        else if(size.equals("big")){
            System.out.println(size+" bark WOOF WOOF!!!");
        }
    }
   
    public void isShortHair(String hair){
        this.hair = hair;
        if(hair.equals("long")){
            System.out.println("Short hair: False");
        }
        else{
            System.out.println("Short hair: True");
        }
    }
}