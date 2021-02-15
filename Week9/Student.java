package Week9;
public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    public Student(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    @Override
    public String toString(){
        return "My first name "+firstname+" lastname "+lastname;
    }
    public static void main(String[]args){
        Student p = new Student("Kan","Buppaniroj");
        System.out.println(p.toString());
    }
}