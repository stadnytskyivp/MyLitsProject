package lectures.lerningJava1;

public class Person {

    private String name;
    private int age;
    private String gender;



    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name){

    }

    public void whoAmI(){
        System.out.println("My name is "+name);
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public Person getPerson(){
        return this;
    }

    public static void foo(){
        System.out.println("foo"); ;  // так не робити!!!
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
