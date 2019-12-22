package com.bubble.recursion;

public class Sort {
    void bubbleSort(int[] input, int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1; i < n; i++) {
            if (input[i - 1] > input[i]) {
                int temp = input[i];
                input[i] = input[i - 1];
                input[i - 1] = temp;
            }
        }
        bubbleSort(input, n - 1);
    }


    public static void main(String[] args) {
        int[] input = {7, 6, 1, 3, 4, 9, 8, 5, 2};

        Sort sort = new Sort();
        sort.bubbleSort(input, input.length);

        for (int i = 0; i < input.length; ++i) {
            System.out.print(input[i] + " ");
            System.out.println();
        }
    }
}


// Time Complexity: O(n*n)