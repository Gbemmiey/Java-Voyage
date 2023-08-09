package Algorithms.DivideAndConquer.Exercise;

public class SortStringsBySize {
    public static void quickSort(String[] array, int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }
    }

    private static int partition(String[] array, int left, int right) {
        return 0;
    }

}


