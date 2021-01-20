package Week7;
//Kan buppaniroj 632115005
public class Pets{
    String name;
    String species;
    String color;
    int age;
    
    public Pets(){}
    public Pets(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void ShowPetData(){
        System.out.println("Name: "+name+"\nSpecies: "+species+"\nColor: "+color+"\nAge: "+age);
    }
}