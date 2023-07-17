package Algorithms.DivideAndConquer.Sorting;

public class GenericSort {
    public static int[] genSort(int[] input) {
        int a, b;
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j <= input.length - 1; j++) {
                a = input[j - 1];
                b = input[j];
                if (a > b) {
                    input[j - 1] = b;
                    input[j] = a;
                }
            }
        }
        return input;

    }
}
