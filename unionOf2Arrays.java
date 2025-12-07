
import java.util.*;

class unionOf2Arrays {

    public static List<Integer> UnionOf2SortedArrays(int arr1[], int arr2[]) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {
            map.put(arr1[i], true);
        }
        for (int i = 0; i < m; i++) {
            map.put(arr2[i], true);
        }
        List<Integer> result = new ArrayList<>(map.keySet());
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 5, 6, 7};
        List<Integer> res = UnionOf2SortedArrays(arr1, arr2);
        System.out.println(res);
    }
}

// //Optimal approach
// import java.util.*;
// class UnionOf2ArraysTwoPointer {
//     public static List<Integer> unionOf2SortedArrays(int[] arr1, int[] arr2) {
//         int n = arr1.length;
//         int m = arr2.length;
//         int i = 0, j = 0;
//         List<Integer> result = new ArrayList<>();
//         // Traverse both arrays
//         while (i < n && j < m) {
//             int val;
//             if (arr1[i] < arr2[j]) {
//                 val = arr1[i];
//                 i++;
//             } else if (arr2[j] < arr1[i]) {
//                 val = arr2[j];
//                 j++;
//             } else {
//                 // both equal
//                 val = arr1[i]; // or arr2[j]
//                 i++;
//                 j++;
//             }
//             // add to result only if not duplicate
//             if (result.isEmpty() || result.get(result.size() - 1) != val) {
//                 result.add(val);
//             }
//         }
//         // Remaining elements in arr1
//         while (i < n) {
//             int val = arr1[i++];
//             if (result.isEmpty() || result.get(result.size() - 1) != val) {
//                 result.add(val);
//             }
//         }
//         // Remaining elements in arr2
//         while (j < m) {
//             int val = arr2[j++];
//             if (result.isEmpty() || result.get(result.size() - 1) != val) {
//                 result.add(val);
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 2, 3, 5};
//         int arr2[] = {2, 3, 4, 4, 6};
//         List<Integer> res = unionOf2SortedArrays(arr1, arr2);
//         System.out.println(res);  // [1, 2, 3, 4, 5, 6]
//     }
// }
