
import java.util.*;

class intersection2Arrays {

    public static List<Integer> intersectionBrute(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // avoid processing same element from arr1 again
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                continue;
            }

            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                    break; // move to next element in arr1
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 3, 6};

        System.out.println(intersectionBrute(arr1, arr2)); // [2, 3]
    }
}

// //Optimal
// import java.util.*;
// class ArrayIntersection {
//     public static List<Integer> findArrayIntersection(int[] A, int[] B) {
//         int n = A.length;
//         int m = B.length;
//         int i = 0;
//         int j = 0;
//         List<Integer> ans = new ArrayList<>();
//         while (i < n && j < m) {
//             if (A[i] < B[j]) {
//                 i++;
//             } 
//             else if (B[j] < A[i]) {
//                 j++;
//             } 
//             else {  // A[i] == B[j]
//                 ans.add(A[i]);
//                 i++;
//                 j++;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] A = {1, 2, 2, 3, 4, 5};
//         int[] B = {2, 2, 3, 3, 6};
//         System.out.println(findArrayIntersection(A, B)); // Output: [2, 2, 3]
//     }
// }
