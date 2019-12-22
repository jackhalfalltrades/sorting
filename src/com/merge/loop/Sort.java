package com.merge.loop;

public class Sort {

    void mergesort(int[] input) {
        if (input.length > 1) {
            int middle = input.length / 2;
            int[] left = new int[middle];
            int[] right = new int[input.length - middle];

            for (int i = 0; i < middle; i++) {
                left[i] = input[i];
            }

            for (int i = middle; i < input.length; i++) {
                right[i - middle] = input[i];
            }
            mergesort(left);
            mergesort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    input[k] = left[i];
                    i++;
                } else {
                    input[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < left.length) {
                input[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                input[k] = right[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {7, 6, 1, 3, 4, 9, 8, 5, 2};

        Sort sort = new Sort();
        sort.mergesort(input);

        for (int i = 0; i < input.length; ++i) {
            System.out.print(input[i] + " ");
            System.out.println();
        }

    }
}
