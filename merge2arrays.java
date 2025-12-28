
import java.util.Arrays;

class merge2arrays {

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int arr1[] = {111, 31, 51, 7};
        int arr2[] = {7, 1, 64, 8};
        merge(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
