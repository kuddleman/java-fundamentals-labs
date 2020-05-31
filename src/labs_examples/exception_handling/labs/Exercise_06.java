package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

  public class Exercise_06 {
    public static void main(String[] args) {
      try {
          methodA();
      } catch(ArithmeticException ex) {
          System.out.println("This is an Arithmetic Exception");
      }

    }
    public static void methodA() throws ArithmeticException {
      methodB();
    }
    public static void methodB() throws ArithmeticException {
      int a = 8;
      int b = 0;
      try {
          int result = a / b;
      } catch (ArithmeticException ex) {
          System.out.println("exception found from method B");
          throw ex;
      }

    }
}

