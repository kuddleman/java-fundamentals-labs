package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
  public class Exercise_01 {

      public static void main(String[] args) {
         int num1 = 2;
         int num2 = 0;

         try {
             System.out.println(add(num1, num2));
         } catch(Exception exc) {
             System.out.println("Please fix error");

         }

          System.out.println("Program completed running");
      }

      public static int add(int a,  int b) {
          return a / b;

      }
}