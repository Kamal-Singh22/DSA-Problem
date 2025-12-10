
import java.util.Arrays;

class ConcatenateArray {

    public static int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 1, 2};
        System.out.println(Arrays.toString(getConcatenation(arr1)));

        int[] arr2 = {22, 21, 20, 1};
        System.out.println(Arrays.toString(getConcatenation(arr2)));
    }
}
