package programme;

import java.util.Scanner;

public class Program6OddEven {

    /**
     *
     * Write a java program to input any number and find out if it’s odd or even
     */

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = x.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even ");
        } else {
            System.out.println(num + " is odd ");
        }

    }
    }