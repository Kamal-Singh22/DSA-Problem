//TC: O(N)

import java.util.Arrays;

class removeDup {

    public static int removeDuplicateNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
        removeDuplicateNumber(arr);
        System.out.println(Arrays.toString(arr));

    }
}
