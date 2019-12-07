package homework.hw4.zoo;

public class Animal implements Eat {

    @Override
    public void eat(String food) {
    }

    public class Monkey extends Animal {

        @Override
        public void eat(String food) {
            if ("banana".equals(food)){
                System.out.println("Monkey eats "+food);
            }else{
                System.out.println("WrongTypeOfFood");
            }
        }
    }

    public class Bear extends Animal{
        @Override
        public void eat(String food) {
            if ("meat".equals(food)){
                System.out.println("Bear eats "+food);
            }else{
                System.out.println("WrongTypeOfFood");
            }
        }
    }

    public class Donkey extends Animal{
        @Override
        public void eat(String food) {
            if ("grass".equals(food)){
                System.out.println("Donkey eats "+food);
            }else{
                System.out.println("WrongTypeOfFood");
            }
        }
    }

}
