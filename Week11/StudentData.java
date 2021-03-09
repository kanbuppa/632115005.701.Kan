package Week11;
class Student{
    String name;
    int age;
    double gpa;
  
    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    public boolean equals(Student std){
        if(std instanceof Student){
            return name == ((Student)std).name;
        }
        else{    
            return false;
        }
    }
  
    public boolean equalsAge(Student std){
        if(std instanceof Student){
            return age == ((Student)std).age;
        }
        else{
            return false;
        }
    }

    public boolean equalsGPA(Student std){
        if(std instanceof Student){
            return gpa == ((Student)std).gpa;
        }
        else{
            return false;
        }
    }
}

public class StudentData {
    public static void main(String[]args){
    
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);

        System.out.println("Cheack name");
        System.out.println("Compare std01,std02: "+std01.equals(std02));
        System.out.println("Compare std01,std03: "+std01.equals(std03));
        System.out.println("Compare std02,std04: "+std02.equals(std04));
        System.out.println("Compare std01,std04: "+std01.equals(std04));
        
        System.out.println("Cheack age");
        System.out.println("Compare std01,std02: "+std01.equalsAge(std02));
        System.out.println("Compare std03,std04: "+std03.equalsAge(std04));
        System.out.println("Compare std01,std03: "+std01.equalsAge(std03));
      
        System.out.println("Cheack GPA");
        System.out.println("Compare std01,std03: "+std01.equalsGPA(std03));
        System.out.println("Compare std02,std04: "+std02.equalsGPA(std04));
        System.out.println("Compare std02,std03: "+std02.equalsGPA(std03));

    }
}