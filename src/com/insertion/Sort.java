package com.insertion;

public class Sort {

    public static void main(String[] args) {
        int[] input = {7, 6, 3, 2, 1, 9, 8, 5, 4};

        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] >key) {
                input[j + 1] = input[j];
                j = j - 1;

            }
            input[j + 1] = key;
        }


        for (int i = 0; i < input.length; ++i) {
            System.out.print(input[i] + " ");
            System.out.println();
        }
    }
}


// Time Complexity: O(n^2)