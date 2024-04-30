package programme;

import java.util.Scanner;

public class Program12AlphabetSymbol {

    /**
     * Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("write a value");
        String value=scan.nextLine();

        if (value.matches("-?\\d+(\\.\\d+)?")) { //numeric formula
            System.out.println("is numeric");
        } else if (value.matches("[a-zA-Z]")) {//alphabet formula
            System.out.println("Value is alphabet");
        }else
        {
            System.out.println("it is operator");


        }


    }



}
