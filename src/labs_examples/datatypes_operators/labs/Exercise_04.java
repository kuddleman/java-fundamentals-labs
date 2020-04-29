package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int c = 3;
        int d = 3;
        if ( c <= d ){
            System.out.println("c is less than or equal to d");
        }

        int e = 4;
        int f = 5;
        if ( f > e ){
            System.out.println("f is greater than e");
        }

        int g = 6;
        int h = 6;
        if ( g >= h) {
            System.out.println("g is greater than  or equal to h");
        }

        int i = 7;
        int k = 7;
        if ( i == k) {
            System.out.println("i is strictly equal to k");
        }

        int j = 8;
        int l = 9;
        if (j != k) {
            System.out.println("j is NOT equal to k");
        }


    }

}

