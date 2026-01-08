
import java.util.Arrays;

public class selectionSort {

    public static void selectionSortAlgo(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 1, 10, 9, 15, 22};
        selectionSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// import java.util.Arrays;
// class Main {
//     public static void main(String[] args) {
//         int[] arr = {12, 1, 10, 9, 15, 22};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
