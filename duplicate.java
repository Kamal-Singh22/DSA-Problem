
import java.util.Arrays;

class duplicate {

    public static boolean hasDuplicate(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        boolean res = hasDuplicate(arr);
        System.out.println(res);
    }
}
