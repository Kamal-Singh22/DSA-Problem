
import java.util.Arrays;

class kthElementMergeSort {

    public static int kthElementMergeSort1(int[] a, int[] b, int k) {
        int n = a.length;
        int m = b.length;

        // Step 1: Combine both arrays
        int[] combined = new int[n + m];
        System.arraycopy(a, 0, combined, 0, n); //Copies array a to combined starting at index 0
        System.arraycopy(b, 0, combined, n, m); //Copies array b to combined starting at index n


        /*        int[] combined = new int[n + m];

// Copy elements from a[]
for (int i = 0; i < n; i++) {
    combined[i] = a[i];
}

// Copy elements from b[]
for (int i = 0; i < m; i++) {
    combined[n + i] = b[i]; // start after the last index of a[]
}
         */
        // Step 2: Sort combined array
        Arrays.sort(combined);

        // Step 3: Return kth element (1-based index)
        return combined[k - 1];
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;

        System.out.println(kthElementMergeSort1(a, b, k));
    }
}
