package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int num1 = 25;
        int num2 = 6;

        int sum = num1 + num2;

        int difference = num1 - num2;

        int product = num1 * num2;

        int myMod = num1 % num2;

        float float1 = (float) num1;
        float float2 = (float) num2;
        float quotient = float1/float2;



        System.out.println("sum is " + sum);
        System.out.println("difference is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("modulus is " + myMod);



    }

}
