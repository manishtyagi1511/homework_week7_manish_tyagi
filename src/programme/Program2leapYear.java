package programme;

import java.util.Scanner;

public class Program2leapYear {

    /**
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
     *
     */

    public static void main(String[] args) {

        Scanner x= new Scanner(System.in);
        System.out.println("Enter the year");
        int year=x.nextInt();

        if (year % 4 ==0 && year % 100 !=0)
        {
            System.out.println(year + "is a leap year");
        }
        else if ((year%4==0) && (year%100 ==0) && (year % 400==0))
        {
            System.out.println(year + "is a leap year");
        }
        else
        {
            System.out.println(year + "  is not a leap year");
        }




        }



    }


