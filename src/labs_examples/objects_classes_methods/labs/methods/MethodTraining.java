package labs_examples.objects_classes_methods.labs.methods;

import static labs_examples.objects_classes_methods.labs.methods.MethodTraining.highestLowest;

public class MethodTraining {


  public static void main(String[] args) {
      int myInt = 5;
      int nextInt = myInt;
      System.out.println("This is nextInt: " + nextInt); // 5

      System.out.println( "The largest of four is: " + largestOfFour(5,8,10,45));

      System.out.println("The number of consonants in the string is: " + countConsonants("hello"));

      System.out.println( "Is this number a prime number? " + isPrime(4));

      int[] myCoolArray = new int[]{1, 23, 456, 78, 45, 5, 56};

      int[] output = highestLowest(myCoolArray);

      System.out.println("Helloxoxoox");


  }

//   1) Demonstrate method overloading in this class

    public static int add( int a, int b) {
      return a + b;
    }

    public static int add( int a, int b, int c) {
      return a + b + c;
    }

    public static float add ( int a, float b) {
      return a + b;
    }

//    2) Demonstrate the difference between "pass by value" and "pass by reference"

      //pass by value:

    int myInt = 5;

    int nextInt = myInt;

    // pass by reference
      int[] intArray = new int[]{1,2,3,4,5,6};

      int[] differentArray = intArray;



//    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)

    public static int largestOfFour( int... varArgs) {
        int largest = varArgs[0];

        for ( int i : varArgs) {
            if( i > largest) {
                largest = i;
            }

        }

        return largest;
    }

//    4) Write a method to count all consonants (the opposite of vowels) in a String

      public static int countConsonants(String str) {
        int stringLength = str.length();
        int numVowels = 0;

        for( int i = 0; i < str.length(); i++) {
            char ltr = str.charAt(i);
            if( ltr == 'a' || ltr == 'e' || ltr == 'i' || ltr == 'o' || ltr == 'u' ) {
                numVowels++;
            }
        }

        int numConsonants = stringLength - numVowels;
        return numConsonants;
      }

//    5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)

//    6) Write a method that will determine whether or not a number is prime

      public static boolean isPrime( int num ){

        for ( int i = num - 1; i >= 2; i--) {
            if ( num % i == 0) {
                return false;
            }
        }
        return true;
      }

//    7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//    which is passed in as an argument

      public static int[] highestLowest(int[] intArray) {
        int highest = intArray[0];
        int lowest = intArray[0];
       int[] solutionArray = new int[ 2 ];


        //find highest number of the given array
        for (int num : intArray) {
            if ( num > highest) {
                highest = num;
            }
        }

        //find lowest number of the given array
        for (int num : intArray) {
            if ( num < lowest ) {
                lowest = num;
            }
        }

//          System.out.println(highest);
//          System.out.println(lowest);

        return solutionArray;

      }

//    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//    length of the returned list

//    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array




}
