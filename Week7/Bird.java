package Week7;
//Kan buppaniroj 632115005
public class Bird extends Pets{
    String country;
    String canfly;

    
    public Bird(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
 
    public void Speak(){
        System.out.println(name+" say Alohaaaaaaaaa!  ");
    }

    public void Checkcountry(String country){
        this.country = country;
        System.out.println(name+" from  "+country+".");
    }
    
    public void Iscanfly(String canfly){
        this.canfly = canfly;
        if(canfly.equals("yes")){
            System.out.println(name+" can fly.");
        }
        else{
            System.out.println(name+" can't fly.");
        }
    }
}