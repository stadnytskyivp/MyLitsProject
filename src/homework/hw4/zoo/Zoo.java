package homework.hw4.zoo;

public class Zoo {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.openZoo();
        zoo.feedAnimals();

    }

    public void openZoo(){
        System.out.println("Zoo is opened:");

        Worker worker = new Worker();
        Worker.AdolfHitzer adolf = worker.new AdolfHitzer("Adolf Hitzer");
        Worker.AhmedAmir ahmed = worker.new AhmedAmir("Ahmed Amir");
        Worker.CarlJonson carl = worker.new CarlJonson("Carl Jonson");
        Animal animal = new Animal();
        Animal.Monkey monkey = animal.new Monkey("monkey");
        Animal.Donkey donkey = animal.new Donkey("donkey");
        Animal.Bear bear = animal.new Bear("bear");

        adolf.watchAfter(donkey.getAnimal());
        carl.watchAfter(monkey.getAnimal());
        ahmed.watchAfter(bear.getAnimal());

        System.out.println(adolf.getName()+" will watch after "+adolf.getAnimal());
        System.out.println(carl.getName()+" will watch after "+carl.getAnimal());
        System.out.println(ahmed.getName()+" will watch after "+ahmed.getAnimal());

        System.out.println("");
    }

    public void feedAnimals(){
        System.out.println("Time to feed animals:");

        Worker worker = new Worker();
        Worker.AdolfHitzer adolf = worker.new AdolfHitzer("Adolf Hitzer");
        Worker.AhmedAmir ahmed = worker.new AhmedAmir("Ahmed Amir");
        Worker.CarlJonson carl = worker.new CarlJonson("Carl Jonson");
        Animal animal = new Animal();
        Animal.Monkey monkey = animal.new Monkey("monkey");
        Animal.Donkey donkey = animal.new Donkey("donkey");
        Animal.Bear bear = animal.new Bear("bear");

        adolf.takesFood("grass");
        ahmed.takesFood("banana");
        carl.takesFood("banana");

        System.out.println(adolf.getName()+" takes "+adolf.feedAnimal());
        System.out.println(ahmed.getName()+" takes "+ahmed.feedAnimal());
        System.out.println(carl.getName()+" takes "+carl.feedAnimal());

        System.out.println("");

        donkey.eat(adolf.feedAnimal());
        bear.eat(ahmed.feedAnimal());
        monkey.eat(carl.feedAnimal());

    }

}
