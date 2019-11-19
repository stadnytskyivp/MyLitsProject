package lectures.lerningJava1;

public class Main {

    public static void main(String[] args){

        Person person = new Person("Vova",27,"Male");
        Developer developer = new Developer("Petro",34,"Male","DoSomething");
        //ProjectManager projectManager = new ProjectManager();

        developer.setName("NotPetro");
        developer.whoAmI();

        Person developer1 = new Developer("Petro",34,"Male","DoSomething");

        developer1 = new ProjectManager("qwer",32,"?","Toung");

        developer1.whoAmI();
        developer1.setName("Tommy");
        developer1.whoAmI();


        /*
        person.whoAmI();
        System.out.println(person.getAge());
        System.out.println(person.getGender());

        Person person1 = person.getPerson();
        person1.age=51;
        System.out.println(person.getAge());
*/
  /*      person.foo();

    int i = 0;
    while (i<10){
        i++;
        if (i%2==0) {
            System.out.print(" "+i);
        }
    }
*/

    }


}
