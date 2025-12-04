
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

    // moves all zeros to the end of the array, keeps order of non-zeros
    public static int[] moveZeros(int[] a) {
        int n = a.length;

        // step 1: collect all non-zero elements in temp
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp.add(a[i]);
            }
        }

        // step 2: copy non-zero elements back to the beginning of a
        int nz = temp.size();   // number of non-zero elements
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        // step 3: fill the remaining positions with 0
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 12, 5, 0, 0, 0]
    }
}
