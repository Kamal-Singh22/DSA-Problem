
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// public class MoveZeros {
//     public static int[] moveZeros(int[] arr) {
//         int n = arr.length;
//         List<Integer> temp = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 0) {
//                 temp.add(arr[i]);
//             }
//         }
//         int nz = temp.size();
//         for (int i = 0; i < nz; i++) {
//             arr[i] = temp.get(i);
//         }
//         for (int i = nz; i < n; i++) {
//             arr[i] = 0;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 0, 3, 12, 0, 5};
//         moveZeros(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
import java.util.Arrays;

class MoveZeros {

    public static void moveAllZeros(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (arr[i] != 0 && arr[j] == 0) {
                    i++;
                    j++;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 4, 0, 4, 0};
        moveAllZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
