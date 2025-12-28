
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

//Brute Force
class DuplicateBruteForce {

    public static boolean hasDuplicate(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true; // duplicate found
                }
            }
        }
        return false; // no duplicate
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        System.out.println(hasDuplicate(arr));  // true
    }
}

//Hash Code
// import java.util.HashSet;
// class DuplicateHashSet {
//     public static boolean hasDuplicate(int[] arr) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : arr) {
//             if (set.contains(num)) {
//                 return true; // duplicate found
//             }
//             set.add(num);
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 1, 5};
//         System.out.println(hasDuplicate(arr));  // true
//     }
// }
// //Two Pointer Approach
// import java.util.Arrays;
// class DuplicateChecker {
//     public static boolean hasDuplicate(int[] arr) {
//         Arrays.sort(arr); // sort first
//         int left = 0;
//         int right = 1;
//         while (right < arr.length) {
//             if (arr[left] == arr[right]) {
//                 return true; // duplicate found
//             }
//             left++;
//             right++;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
//         System.out.println(hasDuplicate(arr)); // true
//     }
// }
