package com.bubble.loop;

public class Sort {


    public static void main(String[] args) {
        int[] input = {5, 6, 1, 3, 4, 9, 8, 7, 2};

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[j - 1] > input[j]) {
                    int temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < input.length; ++i) {
            System.out.print(input[i] + " ");
            System.out.println();
        }
    }


}


// Time Complexity: O(n^2)