package Week9;
class Sheriff extends Person{
    String workState;
    
        public Sheriff(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
        }

        @Override
        public void introduce(){
            super.introduce();
            System.out.println("I'm a sheriff, working in "+workState+".\n");
        }
}