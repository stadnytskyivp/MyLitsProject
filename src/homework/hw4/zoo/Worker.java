package homework.hw4.zoo;

public class Worker {

    private String Name;
    private String animal;
    private String food;

    public class CarlJonson extends Worker{
        private String Name;
        public CarlJonson(String name){ Name=name; }
        @Override
        public String getName() { return Name; }
    }

    public class AhmedAmir extends Worker{
        private String Name;
        public AhmedAmir(String name){ Name=name; }
        @Override
        public String getName() { return Name; }
    }

    public class AdolfHitzer extends Worker{
        private String Name;
        public AdolfHitzer(String name){ Name=name; }
        @Override
        public String getName() { return Name; }
    }


    public String getAnimal() {
        return animal;
    }

    public void watchAfter(String animal) {
        this.animal = animal;
    }

    public String feedAnimal() {
        return food;
    }

    public void takesFood(String food) { this.food = food; }

    public String getName() { return Name; }
}
