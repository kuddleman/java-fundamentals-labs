package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

import java.lang.Math.*;

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

         double radius = 3.14f;
         double height = 5.00;

         double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("the volume of the cylinder is: " + volume);

        double area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(Math.PI, 2);

        System.out.println(" The area of the cylinder is: " + area);



    }
}