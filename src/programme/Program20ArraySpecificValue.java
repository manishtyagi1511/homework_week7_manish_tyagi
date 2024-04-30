package programme;

public class Program20ArraySpecificValue {


    public static void main(String[] args) {
        /**
         * Write a Java program to test if an array contains a specific value.
         */

        int declare[] = {10, 20, 30, 40, 50, 70, 8, 9,};

        int targetValue = 9;

        for (int i = 0; i <= 7; i++) {

            if (declare[i] == targetValue) {
                System.out.println("The Value is found at " +i+ "th position and the value is " + declare[i] );
            } else {
                System.out.println("value is not found");


            }
        }
    }
}


