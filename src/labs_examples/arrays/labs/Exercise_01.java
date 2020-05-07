package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        System.out.println("Give me 10 numbers: ");
        int n = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            sum += n;
        }

        float avg = sum/2;

        System.out.println("The sum of the 10 numbers is: " + sum +" \nThe average of the ten numbers is: " + avg);
    }
}