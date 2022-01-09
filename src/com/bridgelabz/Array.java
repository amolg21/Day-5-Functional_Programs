package com.bridgelabz;

import java.util.Scanner;

public class Array {

    public static int[][] arr;

    public static void main(String[] args) {
        // Making a 2D Array
        int a;
        arr = new int[2][3];     // A array with 2 rows and 3 columns.
        Scanner sc = new Scanner(System.in);
        // Displaying the array.
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println("Enter the value");
                a = sc.nextInt();
                arr[i][j] = a;
                //System.out.print(array[i][j]);
            }

        }
        System.out.println("The array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
