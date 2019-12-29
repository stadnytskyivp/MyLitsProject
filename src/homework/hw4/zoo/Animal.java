package homework.hw4.zoo;

public class Animal implements Eat {

    @Override
    public void eat(String food) {
    }

    public class Monkey extends Animal{

        private String animalType;

        public Monkey(String animalType){
            this.animalType = animalType;
        }
        public String getAnimal() { return animalType; }

        @Override
        public void eat(String food) {
            try{
                System.out.print("Monkey ");
                checkFood("banana",food);
            }catch (WrongTypeOfFoodException e){
                System.out.println("eats "+food);
            }
        }
    }

    public class Bear extends Animal{
        private String animalType;

        public Bear(String animalType){
            this.animalType = animalType;
        }
        public String getAnimal() { return animalType; }

        @Override
        public void eat(String food) {
            try{
                System.out.print("Bear ");
                checkFood("meat",food);
            }catch (WrongTypeOfFoodException e){
                System.out.println("eats "+food);
            }
        }
    }

    public class Donkey extends Animal{
        private String animalType;

        public Donkey(String animalType){
            this.animalType = animalType;
        }
        public String getAnimal() { return animalType; }

        @Override
        public void eat(String food) {
            try{
                System.out.print("Donkey ");
                checkFood("grass",food);
            }catch (WrongTypeOfFoodException e){
                System.out.println("eats "+food);
            }
        }
    }

    public String checkFood(String iLikeFood,String food) throws WrongTypeOfFoodException{
        if (iLikeFood.equals(food) ) {
            throw new WrongTypeOfFoodException("good");
        }
        System.out.println("doesn't like "+food);
        System.out.println("Exception  -WrongTypeOfFood-");
        return "" ;
    }

}
