package programme;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Program19AverageArray {
    /**
     *
     * Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};
       // OptionalDouble aValue =Arrays.stream(a).average();
        OptionalDouble aValue=Arrays.stream(a).average();
        System.out.println("Average arrays" +aValue);
    }
}
