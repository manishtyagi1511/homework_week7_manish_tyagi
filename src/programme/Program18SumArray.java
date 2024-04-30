package programme;

import java.util.Arrays;

public class Program18SumArray {
    public static void main(String[] args) {
        /**
         *Write a Java program to sum values of an array.
         */

        int a[] = {5, 7, 4, 8};

        int arraySum=Arrays.stream(a).sum();
        System.out.println("sum of arrays " + arraySum);



    }
}
