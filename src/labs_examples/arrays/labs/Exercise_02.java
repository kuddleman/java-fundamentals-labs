package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        System.out.println("Chose a number from one to ten(inclusive): ");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        for ( int i = 0; i < array.length; i++) {
            int element = array[i];

           if( num == element){
               System.out.println(i);
           }
        }




    }
}