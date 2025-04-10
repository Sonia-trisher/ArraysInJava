package com.eric;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Alice", "Bob", "Sonia"};
        char[] alphabets = {'A', 'B', 'C'};
        double[] decimals = {1.1, 2.2, 3.3, 4.4, 5.5};

        int[] daysOfTheWeek = new int[7];
        String[] monthsOfYear = new String[12];

        // Indices 1, 21, 43, 2, 3, 4, 5, 6
        numbers[2] = 8;

        // System.out.println(numbers.length);
        // System.out.println(numbers);

//        for (int i = 0; i < numbers.length; i++) {
//            // System.out.println(numbers[i]);
////        }
            for (int a : numbers) {
                System.out.println(a);
            }
            // for (char letter : alphabets) {
            //     System.out.println(letter);
            // }

            for (String name : names) {
                String inLowerCase = name.toLowerCase();
                // System.out.println(inLowerCase);
                // System.out.println(name.toLowerCase());
            }

            for (String name : names) {
                String inUpperCase = name.toUpperCase();
                // System.out.println(inUpperCase);
            }

            // System.out.println(numbers[0]);
            // System.out.println(numbers[1]);
        }
    }