package programme;

import java.util.Scanner;

public class Program10AdditionSubstraction {

    public static void main(String[] args) {
        /**
         * Write a java program to input any two number and ask user to enter
         * their symbol (+, -, /, *) find addition,
         * Subtraction, multiplication and division according to their symbol (using if else)
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("enter first input");
        int a = scan.nextInt();
        System.out.println("enter second input");
        int b = scan.nextInt();
        System.out.println("enter operator");
        char operator = scan.next().charAt(0);

        if (operator == '+') {
            int add = a + b;
            System.out.println("Addition of two numbers is " + add);
        } else if (operator == '-') {
            int subs = a - b;
            System.out.println("Substraction of two numbers is " + subs);
        } else if (operator == '*') {
            int multi = a * b;
            System.out.println("Multiplication of two number is " + multi);
        } else if (operator == '/')
        {
            int divide = a / b;
            System.out.println("divide of two number is " + divide);
        }else{
            System.out.println("invalid operator");
        }


    }

}




