package Week9;

public class Person {
    private String name;
    private int bornYear;

    
    public Person(String name, int bornYear){
       this.name = name;
       this.bornYear = bornYear;
    }
    
    public void introduce(){
        System.out.println("My name is "+name+","+"I was born in "+bornYear+".");
    }

}
