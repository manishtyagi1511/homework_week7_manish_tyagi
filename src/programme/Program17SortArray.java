package programme;

import java.util.Arrays;

public class Program17SortArray {

    /**
     *
     * Write a Java program to sort a numeric array and a string array.
     */
    public static void main(String[] args) {

        int numericArray[]= {10,05,03,12,15};
        System.out.println("Original array" + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("After sorting" +Arrays.toString(numericArray));

        String stringArray[]={"Manish","Prachee","tinu","mummy","dad"};
        System.out.println("Original string array" +Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("after sorting string array" +Arrays.toString(stringArray));






    }
}
