package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int myArray[] = new int[4];
        int myInt = 15;
        try {
           myArray[34] = myInt;
            System.out.println("Inside try block");
        }
        catch( ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        finally {
            System.out.println("FINALLY block");
        }



    }
}
