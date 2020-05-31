package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {

        try{
          int myArray[] = new int[7];
          myArray[1] = 30 / 0;
            System.out.println("This is the try block");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds! NO NO NO");
        }
        catch(Exception e) {
            System.out.println("Some other exception");
        }
        System.out.println("Out of try-catch-blocks");

    }
}


