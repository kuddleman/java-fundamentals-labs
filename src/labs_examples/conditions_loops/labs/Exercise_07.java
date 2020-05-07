

package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word here: ");

       String word = input.nextLine();

       System.out.println(word);

       for (int i = 0; i < word.length(); i++) {
           char letter = word.charAt(i);

          // System.out.println(letter);

         if( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
             System.out.println("Your word was: " + word + " and the first vowel is: " + letter + ".");
             break;
         }
       }






    }
}
