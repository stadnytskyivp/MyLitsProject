package homework.hw4.zoo;

public class Worker {

    private String animal;
    private String food;

    public class CarlJonson extends Worker{

    }

    public class AhmedAmir extends Worker{

    }

    public class AdolfHitzer extends Worker{

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

    public void setFood(String food) {
        this.food = food;
    }
}
