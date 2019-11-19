package homework.hw2;

import java.util.Random;

public class Array {

    private int[] arr;
    private int arrCount;

    public Array(int arrCount){

        this.arrCount=arrCount;
        this.arr = new int[arrCount];  // initializing array

    }

    public Array(){

    }

    public void generateArray(){
        Random myRandom = new Random();

        System.out.print("Мy random generated Array: ");
        arr = new int[arrCount];
        for (int i=0; i<=arr.length-1;i++){
            arr[i]=myRandom.nextInt(99);  // filling array with random numbers
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public void showArray(){
        for(int i=0; i<=arr.length-1; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public int arithmeticMean(){
        int sum = 0;
        for(int i=0; i<=arr.length-1; i++){
            sum+=arr[i];
        }
        sum/=(arr.length);
        return sum;
    }

    public int getMin(){
        int min = 100;
        for(int i=0; i<=arr.length-1; i++){
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getMax(){
        int max = 0;
        for(int i=0; i<=arr.length-1; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public int[] GetEvenArray(){
        int n=0;
        int j=0;

        for(int i=0; i<=arr.length-1; i++) {   // getting quantity of even numbs
            if (arr[i]%2==0){
                n+=1;
            }
        }
        int[] newArr = new int[n];

        for(int i=0; i<=arr.length-1; i++) {  // initializing new even numbs array only
            if (arr[i]%2==0){
                newArr[j] = arr[i];
                j+=1;
            }
        }

        return newArr;
    }

    public int[] GetNotEvenArray(){
        int n=0;
        int j=0;

        for(int i=0; i<=arr.length-1; i++) {   // getting quantity of not odd numbs
            if (arr[i]%2!=0){
                n+=1;
            }
        }
        int[] newArr = new int[n];

        for(int i=0; i<=arr.length-1; i++) {  // initializing new odd numbs array only
            if (arr[i]%2!=0){
                newArr[j] = arr[i];
                j+=1;
            }
        }

        return newArr;
    }

    public void showIndexOfEvenNumbs(){
        String str="";

        for(int i=0; i<=arr.length-1; i++) {   // getting indexes of even numbs
            if (arr[i]%2==0){
                str+=i+" ";
            }
        }
        System.out.println(str);

    }

    public void showIndexOfOddNumbs(){
        String str="";

        for(int i=0; i<=arr.length-1; i++) {   // getting indexes of odd numbs
            if (arr[i]%2!=0){
                str+=i+" ";
            }
        }
        System.out.println(str);
    }

}
