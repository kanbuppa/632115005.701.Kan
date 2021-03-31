package Week4;

public class MainPerson {

    public static void main(String[] args) {
        // declar the person array
        Person[] person;
        person = new Person[10];
        // create the person[e] object
        person[1] = new Person();
        // Assign the data for person[e]
        person[1].setName("Peter Parker");
        person[1].setAge(20);
        person[1].setGender('M');
        person[1].setSalary(10000);
        person[1].setGPA("2.30");
        person[2] = new Person();
        person[2].setName("Mary Jane");
        person[2].setAge(19);
        person[2].setGender('F');
        person[2].setSalary(13000);
        person[2].setGPA("3.17");
        person[3] = new Person();
        person[3].setName("Miles Morales");
        person[3].setAge(16);
        person[3].setGender('M');
        person[3].setSalary(4000);
        person[3].setGPA("2.57");
        person[4] = new Person();
        person[4].setName("Tony Stark");
        person[4].setAge(46);
        person[4].setGender('F');
        person[4].setSalary(7000000);
        person[4].setGPA("4.00"); 
        person[5] = new Person();
        person[5].setName("Kan Buppaniroj");
        person[5].setAge(18);
        person[5].setGender('F');
        person[5].setSalary(7000);
        person[5].setGPA("3.03");
        // show person[8] data
        for (int i = 1; i < 6; i++) {
            System.out.println("Name of person " + i + " is " + person[i].getName());
            System.out.println("Age of person " + i + " is " + person[i].getAge());
            System.out.println("Gender of person " + i + " is " + person[i].getGender());
            System.out.println("Salary of person " + i + " is " + person[i].getSalary());
            System.out.println("GPA of person " + i + " is " + person[i].getGPA());
            System.out.println("------------------------");
        }
    }
}