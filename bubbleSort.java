
import java.util.Arrays;

public class bubbleSort {

    public static void Sort(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 2, 33, 4, 55, 0, 100};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
