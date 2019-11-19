package lectures.lerningJava1;

public class ProjectManager extends Person {

    String primaryLanguage;

    public ProjectManager(String name, int age, String gender, String primaryLanguage){
        super(name,  age, gender);
        this.primaryLanguage = primaryLanguage;

    }

    @Override
    public void whoAmI() {
        System.out.println("I am Project Manager named "+getName());
    }



}
