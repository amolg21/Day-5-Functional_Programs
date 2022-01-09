package com.bridgelabz;

public class Distance {

    public static void main(String[] args) {

        // Calculating the distance of ( x , y ) from origin ( 0 , 0 ).
        int x , y;
        double distance;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        double a = Math.pow(x,2);           // Using variable a and b for simplification.
        double b = Math.pow(y,2);
        distance = Math.sqrt( a + b );
        System.out.println("The distance from origin (0,0) to (x,y) is "+distance);
    }
}
