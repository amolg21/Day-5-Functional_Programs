package com.bridgelabz;

import java.util.Scanner;
import  java.lang.Math;

public class Quadratic {

    public static void main(String[] args) {
        //  Taking the values of a, b, c from user.
            Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a= ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b= ");
        int b = sc.nextInt();

        System.out.println("Enter the value of c= ");
        int c = sc.nextInt();

        // The Equation thus formed from the input values.
       System.out.println("The Equation is =" + a+"x*x"+b+"x"+"+"+c);
        int delta;
        delta = (int) (Math.pow(b,2)-4*a*c);

        // Calculating the roots.

        double root1, root2;
        root1= ((-b + Math.sqrt(delta)) / 2*a);
        root2= ((-b - Math.sqrt(delta)) / 2*a);
        System.out.println("The roots of the equation is= "+ root1 + " and " + root2);
    }

}
