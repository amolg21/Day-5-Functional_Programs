package com.bridgelabz;

public class WindChill {

    public static void main(String[] args) {
        System.out.println("The values of temperature (t) is in Fahrenheit " +
                 "The value of speed (v) is in miles per hour");

        double t, v, a;
        double windChill;
        t = Integer.parseInt(args[0]);
        v = Integer.parseInt(args[1]);
        a = Math.pow(v,0.16);
        windChill= (35.74 + 0.6215*t + (0.9275*t -35.75)*a);

        if (t > 50 || v > 120 || v < 3) {
            System.out.println("Please enter the value of t less than 50 and the value of v in between 3 and 120.");
        }
        System.out.println("The wind chill is "+windChill);
    }
}