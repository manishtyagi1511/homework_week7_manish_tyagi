package programme;

import java.util.Scanner;

public class Program9AToFSwitch {
    public static void main(String[] args) {
        /**
         * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
         * if any other alphabet should be invalid entry
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter alphabet");
        String city=scan.nextLine();


        switch (city) {
            case "A":
                System.out.println("Amsterdam");
                break;
            case "B":
                System.out.println("Bankok");
                break;
            case "C":
                System.out.println("China");
                break;
            case "D":
                System.out.println("Denmark");
                break;
            case "E":
                System.out.println("England");
                break;
            case "F":
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid alphabet");


        }
    }


}
