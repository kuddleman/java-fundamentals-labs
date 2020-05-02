package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What will be the LOWER bound? ");
        int lower = scanner.nextInt();

        System.out.print("What will be the UPPER bound? ");
        int upper = scanner.nextInt();


       //calculate sum of all number from lower to upper

        int sum = 0;

        for( int i = lower; i <= upper; i++) {
            sum += i;
        }

        System.out.println("The sum of all the numbers is: " + sum);

        //Calculate the average of all the numbers

        float numberOfDigits = upper - lower + 1;

        float average = sum / numberOfDigits;

        System.out.println("The average is: " + average);







    }
}
