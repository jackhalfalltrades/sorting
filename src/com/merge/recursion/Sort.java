package com.merge.recursion;

public class Sort {

    void merge(int[] input, int low, int high, int middle) {

        int[] left = new int[middle];
        int[] right = new int[input.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = input[i];
        }

        for (int i = middle; i < input.length; i++) {
            right[i - middle] = input[i];
        }
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

    void sort(int[] input, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;

            sort(input, low, middle);
            sort(input, middle + 1, high);

            merge(input, low, high, middle);
        }
    }


    public static void main(String[] args) {
        int[] input = {7, 6, 1, 3, 4, 9, 8, 5, 2};

        Sort sort = new Sort();
        sort.sort(input, 0, input.length);

        for (int i = 0; i < input.length; ++i) {
            System.out.print(input[i] + " ");
            System.out.println();
        }

    }
}


// Time Complexity: O(nLogn)
