package com.eric;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        // An array of unsorted numbers
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers); // Sort the array in ascending order
        // System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Sorting in descending order user Array.sort
        Integer[] numbers2 = {5, 3, 8, 1, 2};
        Arrays.sort(numbers2, (a, b) -> b - a); // Sort in descending order
        // Arrays.sort(numbers2, (a, b) -> a - b); // Sort in ascending order
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers2));
    }
}
