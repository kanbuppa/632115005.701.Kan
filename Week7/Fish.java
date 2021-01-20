package Week7;
//Kan buppaniroj 632115005
public class Fish extends Pets{
    String size;
    String properties;
    
  
    public Fish(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    
    public void isSwimToSea(String properties){
        this.properties = properties;
        if(properties.equals("freshwater")){
            System.out.println("Freshwater swims to the sea: False");
        }
        else if(properties.equals("seawater")){
            System.out.println("Seawater swims to the sea: True"); 
        }
    }
  
    public void Swimfast(String size){
        this.size = size;
        if(size.equals("small")){
            System.out.println(name+" is "+size+"fish swims fast.");
        }
        else if(size.equals("medium")){
            System.out.println(name+" is "+size+"fish swims slow.");
        }
        else if(size.equals("big")){
            System.out.println(name+" is "+size+"fish swims very slow.");
        }
    }
}