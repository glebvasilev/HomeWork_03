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
        }else {
            System.out.println("Min number is: " + one);
        }

        // number description
        int number = -12;

        if (number > 0) {
            System.out.println(-12 + " Is above zero");
        } if (number < 0) {
            System.out.println(-12 + " Is below zero");
        } if (number %2 == 0) {
            System.out.println(-12 + " Is even number");
        } else {
            System.out.println(-12 + " Is an odd number");
        }

        // multiplication table
        for (int i = 1; i <= 10; i++){
            System.out.println(("1x" + i + " =  " + i + "\t" + "2x" + i + " =  " + (2 * i)
                    + "\t" + "3x" + i + " =  " + (3 * i) + "\t" + "4x" + i + " =  " + (4 * i)
                    + "\t" + "5x" + i + " =  " + (5 * i) + "\t" + "6x" + i + " =  " + (6 * i)
                    + "\t" + "7x" + i + " =  " + (7 * i) + "\t" + "8x" + i + " =  " + (8 * i)
                    + "\t" + "9x" + i + " =  " + (9 * i) + "\t" + "10x" + i + " =  " + (10 * i)));
        }

        // arithmetic progression for N
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // geometric progression for N
        for (int i = 1; i <= 1000; i *= 2){
            System.out.println(i);
        }
    }
}

