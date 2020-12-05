package com.company;

public class Main {
    /*
     *  Class serves for counting min number, number description,
     *  multiplication table and progressions for N
     */

    public static void main(String[] args) {

        // min number
        int one = 10;
        int two = 100;

        if (one > two) {
            System.out.println("Min number is: " + two);
        } else if (one == two) {
            System.out.println("The values are equal");
        } else {
            System.out.println("Min number is: " + one);
        }


        // number description
        int number = -12;

        if (number > 0 & number % 2 == 0) {
            System.out.println(number + " is above zero and even number");
        } else if (number > 0 & number % 2 == 1) {
            System.out.println(number + " is above zero and is an odd number");
        } else if (number == 0) {
            System.out.println(number + " is zero");
        } else if (number < 0 & number % 2 == 0) {
            System.out.println(number + " is below zero and even number");
        } else {
            System.out.println(number + " is below zero and is an odd number");
        }

        // multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(("1x" + i + " =  " + i + "\t" + "2x" + i + " =  " + (2 * i)
                    + "\t" + "3x" + i + " =  " + (3 * i) + "\t" + "4x" + i + " =  " + (4 * i)
                    + "\t" + "5x" + i + " =  " + (5 * i) + "\t" + "6x" + i + " =  " + (6 * i)
                    + "\t" + "7x" + i + " =  " + (7 * i) + "\t" + "8x" + i + " =  " + (8 * i)
                    + "\t" + "9x" + i + " =  " + (9 * i) + "\t" + "10x" + i + " =  " + (10 * i)));
        }

        // arithmetic progression for N
        System.out.println("arithmetic progression for N");
        int n = 10; // num of elements
        int a = 1; // start point
        int d = 1; // factor

        int[] ari_array = new int[n];
        for (int i = 0; i < n; i++) {
            ari_array[i] = a + d * i;
            System.out.print(ari_array[i] + " ");
        }

        // geometric progression for N
        System.out.println(" ");
        System.out.println("geometric progression for N");
        int n_01 = 1000; // exit condition
        int a_01 = 1; // start point
        int d_01 = 2; // factor

        int[] geo_array = new int[n_01];
        for (int y = 1; y < n_01; y *= d_01) {
            geo_array[y] = a_01 * d_01 * y;
            System.out.print(geo_array[y] + " ");
        }
    }
}

