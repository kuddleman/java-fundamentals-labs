package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int[][] funny_array = {
                {5,6,7},
                {3,5,7,4},
                {8,9},
                {19,20,21,22, 23,24}
        };

        for (int i = 0; i < funny_array.length; i++) {
            for (int j = 0; j < funny_array[i].length; j++) {
                System.out.print(funny_array[i][j] + "|");
            }
            System.out.println();
        }


    }

}
