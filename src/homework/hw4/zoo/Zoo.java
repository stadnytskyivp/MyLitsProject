package homework.hw4.zoo;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal.Monkey monkey = animal.new Monkey();
        Animal.Donkey donkey = animal.new Donkey();
        Animal.Bear bear = animal.new Bear();
        Worker worker = new Worker();
        Worker.AdolfHitzer adolf = worker.new AdolfHitzer();
        Worker.AhmedAmir ahmed = worker.new AhmedAmir();
        Worker.CarlJonson carl = worker.new CarlJonson();



        adolf.watchAfter("donkey");
        adolf.setFood("grass");
        donkey.eat(adolf.feedAnimal());

        carl.watchAfter("monkey");
        carl.setFood("carrot");
        monkey.eat(carl.feedAnimal());

        ahmed.watchAfter("bear");
        ahmed.setFood("meat");
        bear.eat(ahmed.feedAnimal());

    }

}
