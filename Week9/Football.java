package Week9;
class Football extends Person{
    String team;

    public Football(String name, int bornYear, String team) {
        super(name, bornYear);
        this.team = team;
    }
        
        @Override
        public void introduce(){
            super.introduce();
            System.out.println("I'm a football player and working in "+team+" football club.\n");
        }
}