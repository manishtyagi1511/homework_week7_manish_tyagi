package programme;

import java.util.Scanner;

public class Program8AlphabetAtoF {
    /**
     * Input any alphabet from “A" to “F” and print their city name
     * accordingly (use if else) if any other alphabet should be invalid entry
     */
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter the Alphabet to find a city");
        String city = user.nextLine();

        //String city1 = city.toUpperCase();

        if (city.equals("A")) {
            System.out.println("Amsterdam");
        } else if (city.equals("B")) {
            System.out.println("Bankok");
        } else if (city.equals("C")) {
            System.out.println("China");
        } else if (city.equals("D")) {
            System.out.println("Denmark");
        } else if (city.equals("E")) {
            System.out.println("England");
        } else if (city.equals("F")) {
            System.out.println("France");

        }

    }


    }


