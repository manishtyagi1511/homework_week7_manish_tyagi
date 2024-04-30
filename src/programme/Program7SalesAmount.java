package programme;

import java.util.Scanner;

public class Program7SalesAmount {

    /**
     * Write a java program input sales id, seller's name, sales amount,
     * and salary basic and then fined this sales
     * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000
     * 10% >= 10,000 5% < 10,000 2%
     *
     */

    public static void main(String[] args) {
        double commision;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter sales Id");
        int salesID = x.nextInt();
        System.out.println("Enter sellers name");
        String sellersName = x.next();
        System.out.println("enter sales amount");
        double salesAmount = x.nextDouble();
        System.out.println("basic salary");
        double basicSalary = x.nextDouble();

        //double totalSalary=basicSalary+commision;

        if (salesAmount >= 50000) {

            commision = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commision = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commision = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commision = salesAmount * 0.05;
        } else {
            commision = salesAmount * 0.02;
        }

        double totalSalary = basicSalary + commision;
        System.out.println("total salaray is" + totalSalary);
    }
}





