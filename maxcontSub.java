// maximum in every contiguous subarray of size k

import java.util.Arrays;

class maxconstSub {

    public static int[] maxSubarrayBruteForce(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            res[i] = max;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        System.out.println(Arrays.toString(maxSubarrayBruteForce(arr, k)));
    }
}
