package lectures.lerningJava1;

public class Developer extends Person {

    String primarySkill;

    public Developer(String name, int age, String gender, String primarySkill){
        super(name,  12, "Male");
        this.primarySkill = primarySkill;

    }

    @Override
    public void whoAmI() {
        System.out.println("I am developer named "+getName());
    }
}
