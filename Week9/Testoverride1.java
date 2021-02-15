package Week9;
// Kan Buppaniroj 632115005
public class Testoverride1 {
    public static void main(String[]args){
        Person person1;
        person1 = new Person("Mark",2001);
        person1.introduce();
   

        Sheriff person2 = new Sheriff("Mateo",1998,"California");
        person2.introduce();

        Teacher person3 = new Teacher("Ball", 1977, "CMU");
        person3.introduce();

        PrimeMinister person4 = new PrimeMinister("Tu", 1954, "Thailand");
        person4.introduce();

        Football person5 = new Football("Messi", 1987, "Barcelona");
        person5.introduce();

        Rapper person6 = new Rapper ("Lil Mosey", 2002, "USA");
        person6.introduce();

    }
}