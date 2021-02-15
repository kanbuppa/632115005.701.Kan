package Week9;
class Rapper extends Person{
    String sing;
        public Rapper(String name, int bornYear, String sing){
            super(name, bornYear);
            this.sing = sing;
        }
        
       
        @Override
        public void introduce(){
            super.introduce();
            System.out.println("I'm a American rapper working in "+sing+".\n");
        }
}