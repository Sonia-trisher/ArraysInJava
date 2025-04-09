package com.eric;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in a multi-dimensional array
        System.out.println(numbers[0][0]); // Output: 1
        System.out.println(numbers[1][2]); // Output: 6
        System.out.println(numbers[2][1]); // Output: 8

        // Iterating through a multi-dimensional array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
