package Week4;


public class Score {
    public static void main(String[] args) {
        // declar the person array
        Person[] person;
        person = new Person[100];

        // Assign the data for person[e]
        for (int i = 1; i < 101; i++) {
            person[i] = new Person();
            
            System.out.println("Student " + i + " is " + person[i].getScore());
           
    }}

}
    
  