package com.quick;

public class Sort {

    int partition(int[] input, int low, int high) {

        int pivot = input[high];
        int i = low;

        for (int j = low; j < high; j++) {

            if (input[j] < pivot) {

                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
            }
        }

        int temp = input[i];
        input[i] = pivot;
        input[high] = temp;
        return i;
    }


    void sort(int[] input, int low, int high) {

        if (low < high) {

            int pi = partition(input, low, high);
            // call partitiion
            sort(input, low, pi - 1) ;
            sort(input, pi + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] input = {7, 6, 3, 2, 1, 9, 8, 5, 4};
        Sort sort = new Sort();
        sort.sort(input, 0, input.length-1);


        for (int i = 0; i < input.length; ++i) {
            System.out.print(input[i] + " ");
            System.out.println();
        }
    }
}


// Time Complexity: O(n^2)