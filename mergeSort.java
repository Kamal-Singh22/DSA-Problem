
import java.util.Arrays;

class mergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 1, 10, 9, 15, 22, 100};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(arr));
    }
}
