
import java.util.Arrays;

class removeDuplicate {

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return new int[0];
        }
        int Index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[Index] = arr[i];
                Index++;
            }
        }
        int[] uniqueArray = new int[Index];
        for (int i = 0; i < Index; i++) {
            uniqueArray[i] = arr[i];
        }
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 2, 2, 2};
        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.println("Unique:   " + Arrays.toString(removeDuplicates(arr1)));
    }
}
