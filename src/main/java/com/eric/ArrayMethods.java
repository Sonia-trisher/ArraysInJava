package com.eric;
public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] names = {"keza", "bob", "sonia"};
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        double[] decimal = {1.1, 2.2, 3.3};
        int[] dayOfWeek = new int[7];
        String[] monthOfYear = new String[12];
//Indices 1,21,43,2,3,4,5,6

        numbers[2] = 8;
        numbers[3] = 9;
        System.out.println(numbers.length);
        System.out.println(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
//        for(int n:numbers){
//            System.out.println(n);
//        }
        System.out.println(names.length);

        for (String name : names) {
//            String inUpperCase = name.toUpperCase();
//            System.out.println(inUpperCase);
            System.out.println(name.toUpperCase());
        }
    }
}

