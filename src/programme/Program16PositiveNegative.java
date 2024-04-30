package programme;

import java.util.Scanner;

public class Program16PositiveNegative {

    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
     *
     */

    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = x.nextInt();

        if (num>=1) {
            System.out.println("positive");
        }else if (num<=-1) {
            System.out.println("negative");
        }else
            System.out.println("zero");

        }
    }

