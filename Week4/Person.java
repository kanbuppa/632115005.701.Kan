package Week4;

public class Person {
    // person attibute
    private String name;
    private int age;
    private char gender;
    private int salary;
    private String gpa;
    private double score;
    private double aver;
    private double sum;

    public Person() {
        name = "Unassigned";
        age = 0;
        score = 0;
        gender = 'M';
        sum = 0;
    }
    public double getScore() {
        double score = (int) (Math.random() * 100);  
        return score;
    }
   
    // return name of person
    public String getName() {
        return name;
    }

    // return age of person
    public int getAge() {
        return age;
    }

    // return gender of person
    public char getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public String getGPA() {
        return gpa;
    }

    // Assgins name of person
    public void setName(String personName) {
        name = personName;
    }
    public void setScore(int personScore) {
        score = personScore;
    }

    // Assigns age of person
    public void setAge(int personAge) {
        age = personAge;
    }// assing gender of person

    public void setGender(char personGender) {
        gender = personGender;
    }

    public void setSalary(int personSalary) {
        salary = personSalary;
    }

    public void setGPA(String personGPA) {
        gpa = personGPA;
    }
}