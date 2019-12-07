package lectures.generics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LitsList<String> arr = new LitsList();

    }
        /*
// конваріантність
String[] s = new String[] {"a","b","c"};
Object[] o = s;
// інваріантність
List<Integer> ints = Arrays.asList(1,2,3);
List<Number> nymbers = ints;
//
?- whilecard
List<?> - can put inside any type
        List<Integer> ints = Arrays.asList(1,2,5,8);
        List<? extends Number> nmbr = ints;
        nmbr.add(new Inteeger(3));
// контерваріантність
        List<Number> nmbr = Arrays.asList(1,2,3);
        List<? super Integer> ints = nmbr;
        ints.add(1); */

    //public static  double sum(List accounts)

}

// bridge methods  ??
// list -  рафф тип без параметрів
//"->" - лямбда