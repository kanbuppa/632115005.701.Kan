package Week6;

public class InheritanceExample {

public static void main(String[] args){
Artist art = new Artist("Kan", 19,"Female");
art.genre="hip hop";
art.introduce();
art.playMusic();

Job1 job1=new Job1();
job1.differentJob= "Doctor";
job1.DisplayJob();
Job2 job2=new Job2();
job2.differentJob="Engineer";
job2.DisplayJob();
Job3 job3=new Job3();
job3. differentJob="Actor";
job3.DisplayJob();
Job4 job4=new Job4();
job4.differentJob="Musician";
job4.DisplayJob();
Job5 job5=new Job5();
job5.differentJob="Chef";
job5.DisplayJob();
    
}
}