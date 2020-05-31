package labs_examples.exception_handling.labs;
  import java.util.*;
/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {
    public static void main(String[] args) {
        try{
            doYouKnow();
        } catch (AnswerToLife e) {
            System.out.println(e.toString());
        }



    }

    public static void doYouKnow() throws AnswerToLife {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Oracle");
        System.out.println("Do you know the secret of life?(y/n)");
        String response = scanner.next();

        if( response.equalsIgnoreCase("n")){
            throw new AnswerToLife();
        }
    }

}