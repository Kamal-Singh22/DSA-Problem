
import java.util.Arrays;

public class insertionSort {

    public static void insertionSortAlgo(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 1, 10, 9, 15, 22};
        insertionSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
