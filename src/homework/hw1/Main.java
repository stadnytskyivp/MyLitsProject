package homework.hw1;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        System.out.println("TASK1:");
        t1.doTaks1();
        System.out.println("TASK2:");
        t2.doTask2();
        System.out.println("");
        System.out.println("TASK3:");
        t3.doTask3();


    }


    public static class Task1{

        private double a=2;
        private double b=3;
        private double c=4;
        private double d=5;
        private double e=6;

        public void doTaks1(){

            System.out.println( ((a+b)/(d-b))*2 );
            System.out.println( (a+2*2-12/a*(b-c)) );
            System.out.println( (b+11*c-a) );
            System.out.println( (a*(c+b+d)-e/1+a) );
            System.out.println( (a+b*(a-b)/12) );

        }
    }

    public static class Task2{

        private int[] myArray;

        public void doTask2(){

            System.out.print("myArray: ");
            myArray = new int[100];
            for (int i=0; i<=myArray.length-1;i++){
                myArray[i]=i;
                System.out.print(myArray[i]+" ");
            }

            System.out.println("");
            System.out.print("Even numbers: ");
            for(int i:myArray){
                if (i%2==0){
                    System.out.print(" "+myArray[i]);
                }
            }

            System.out.println("");
            System.out.print("/3 numbers: ");
            for(int i:myArray){
                if (i%3==0){
                    System.out.print(" "+myArray[i]);
                }
            }

            System.out.println("");
            System.out.print("/5 numbers: ");
            for(int i:myArray){
                if (i%5==0){
                    System.out.print(" "+myArray[i]);
                }
            }

            System.out.println("");
            System.out.print("/7 numbers: ");
            for(int i:myArray){
                if (i%7==0){
                    System.out.print(" "+myArray[i]);
                }
            }

        }
    }

    public static class Task3{

        private int a;

        public void doTask3(){

            Random myRandom = new Random();

            System.out.print("Мy starting Array: ");
            int[] myArray = new int[20];
            for (int i=0; i<=myArray.length-1;i++){
                myArray[i]=myRandom.nextInt(99);
                System.out.print(myArray[i]+" ");
            }

            System.out.println("");
            for (int i=0; i<=myArray.length-1; i++){
                for (int j=0; j<=myArray.length-1; j++){

                    a=myArray[i];
                    if (a < myArray[j]) {
                        myArray[i] = myArray[j];
                        myArray[j] = a;
                    }
                }
            }

            System.out.print("My final Array:   ");
            for (int i=0; i<=myArray.length-1;i++){
                System.out.print(" "+myArray[i]);
            }

        }
    }

}
