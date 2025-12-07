
import java.util.*;

class intersection2Arrays {

    public static List<Integer> intersectionBrute(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // avoid processing same element from arr1 again
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                continue;
            }

            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                    break; // move to next element in arr1
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 3, 6};

        System.out.println(intersectionBrute(arr1, arr2)); // [2, 3]
    }
}
