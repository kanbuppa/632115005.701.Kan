package Week9;
class Teacher extends Person{
    String workState;

        public Teacher(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
        }

       
        @Override
        public void introduce(){
            super.introduce();
            System.out.println("I'm a teacher, teaching students at "+workState+".\n");
        }

}