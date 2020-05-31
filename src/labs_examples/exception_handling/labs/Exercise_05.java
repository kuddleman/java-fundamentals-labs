package labs_examples.exception_handling.labs;

import com.sun.tools.javac.comp.Check;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        System.out.println("Please show your I.D.");
        checkAge(3);
        System.out.println("You are old enough to drink!");
    }

     static void checkAge( int age ) {
        if( age < 21) {
            System.out.println("Sorry, you are carded!");
            throw new ArithmeticException("You are carded!");

        } else {
            System.out.println("Welcome to the Bolt Bar");
        }
    }

}


