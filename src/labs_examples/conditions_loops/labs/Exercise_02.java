package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Choose a number from 1 to 7 (inclusive) to find out what day that number corresponds to: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        if ( number == 1 ) {
            System.out.println("Today is MONDAY");
        } else if ( number == 2 ) {
            System.out.println( "Today is TUESDAY");
        } else if ( number == 3 ) {
            System.out.println( "Today is WEDNESDAY");
        } else if ( number == 4 ) {
            System.out.println( "Today is THURSDAY" );
        } else if ( number == 5) {
            System.out.println( "Today is FRIDAY");
        } else if ( number == 6 ) {
            System.out.println( "Today is SATURDAY");
        } else if ( number == 7 ) {
            System.out.println( "Today is SUNDAY");
        } else {
            System.out.println( "Sorry, I don't know what day it is.");
        }

    }
}
