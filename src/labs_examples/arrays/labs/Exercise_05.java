package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
       int[] myNums = { 45, 67, 234, 8, 345,  23, 345, 567};

       for ( int i = myNums.length-1; i >= 0; i -= 2) {
           System.out.println( myNums[i]);
       }



    }


}
