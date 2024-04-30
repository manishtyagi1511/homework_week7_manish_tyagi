package programme;

import java.util.Scanner;

public class Program1OddEven {
    /*
    Write a java program that tells us that Input number is odd or even?
     HINT: use ternary operator (? :)
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= reader.nextInt();

        String evenOdd = (num % 2 ==0) ? "Even" : "Odd";
        System.out.println(num+ " is " +evenOdd);

    }
}
