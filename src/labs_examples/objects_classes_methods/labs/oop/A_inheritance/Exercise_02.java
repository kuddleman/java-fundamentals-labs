package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * We declare a variable "A" with the type of class A.
 * We then let "A" take the value of a new class B
 *
 * We want to print out a's variable i..
 *
 * a is really b.  B is an extension of A, so A's
 * i = 10 will win the day.
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}