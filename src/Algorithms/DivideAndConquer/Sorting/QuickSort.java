package Algorithms.DivideAndConquer.Sorting;

import java.util.Random;

public class QuickSort {
    static Random random = new Random();

    public static int[] sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private static void quickSort(int[] numbers, int first, int last) {
        if (first < last) {
            // Select a pivot point
            int pivotIndex = first + random.nextInt(last - first + 1);
            int pivot = numbers[pivotIndex];
            int k = partition(numbers, first, last, pivot);

            // recursively sort the elements to the left of the pivot
            quickSort(numbers, first, k);
            // recursively sort the elements to the right of the pivot
            quickSort(numbers, k + 1, last);

        }
    }

    private static int partition(int[] numbers, int first, int last, int pivot) {
        int l = first;
        int r = last;

        while (l <= r) {
            while (l <= r && numbers[l] <= pivot) {
                l++;
            }
            while (l <= r && numbers[r] > pivot) {
                r--;
            }

            if (l <= r) {
                exchangeNumbers(numbers, l, r);
//                move index to next position on both sides
                l++;
                r--;
            }
        }
        return l - 1;
    }

    private static void exchangeNumbers(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

        // exchange numbers
    }
}
