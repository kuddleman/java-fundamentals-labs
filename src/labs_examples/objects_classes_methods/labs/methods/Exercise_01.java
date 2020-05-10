package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int num1 = 10;
        int num2 = 5;

        System.out.println( multiply( num1, num2 ));
        System.out.println( divide( num1, num2 ));
        joke();
        System.out.println( numSec(num2));

        fun(1,2,3,4,5);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b){
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    static int divide( int a, int b){
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    static void joke() {
        System.out.println("Here is my joke!");
    }
    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    static int numSec( int years) {
      return years * 365 * 24 * 60 * 60;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static void fun(int ... a) {
        System.out.println( "This many args were passed: " + a.length);
    }






}
