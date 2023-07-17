package Algorithms.DivideAndConquer.Searching;

public class BinarySearch {
    public static int getSearch(int[] input, int searchTerm) {

        int N = input.length;
        int start = input[0];
        int end = input[N - 1];
        int mid = 0;
        int output = 0;

        if (searchTerm > input[N - 1] || searchTerm < input[0]) {
            output = -1;
        } else {
            while (mid != searchTerm) {
                System.out.println("Start: " + start + "\t" + mid + "\t End: " + end);
                mid = (start + end) / 2;
                if (mid == searchTerm) {
                    output = mid;
                } else if (searchTerm < mid) {
                    end = mid;
                } else if (searchTerm > mid) {
                    start = mid;
                } else {
                    break;
                }
            }
        }
        return output;
    }

}
