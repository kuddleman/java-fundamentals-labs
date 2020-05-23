package labs_examples.objects_classes_methods.labs.methods;

public class practiceMethods {

    public static void main(String[] args) {

      add(2,3);

    }

    //add 2 or 3 numbers together.  Only call the 'add' function.  Print out sum

//    public static void add(int a, int b) {
//        int sum = a + b;
//        System.out.println(sum);
//    }

//    public static void add(int a, int b, int c) {
//        int sum = a + b + c;
//        System.out.println(sum);
//    }

    public static void add(int... varArgs){
        int sum = 0;
        for (int i : varArgs) {
            sum += i;
        }

        System.out.println(sum);
    }

    //takes int as input....n
    //return an int nth fibonacci number
    //0 1 1 2 3 5 8 13

    //n = 0  return 0

    public static int nthfib(int n){
        //base case
        if ( n <= 1 ){
            return 0;
        }
          return  nthfib((n - 1)) + nthfib((n-2));

    }



}
