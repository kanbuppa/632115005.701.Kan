package Week9;

class PrimeMinister extends Person{
    String country;

        public PrimeMinister(String name, int bornYear, String country){
            super(name, bornYear);
            this.country = country;
        }

       
        @Override
        public void introduce(){
            super.introduce();
            System.out.println("I'm the prime minister and work in "+country+".\n");
        }
}