package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        try{
            int myArray[] = { 1, 2, 3, 4, 5, 6 };
            System.out.println(myArray[1]);
            try {
                int x = myArray[3] / 0;
            } catch( ArithmeticException exc2) {
                System.out.println("Can't divide by zero");
            }
        } catch(ArrayIndexOutOfBoundsException exc1) {
            System.out.println("Array index is out of bounds");
        }

    }
}
