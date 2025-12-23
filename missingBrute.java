
class missingBrute {

    public static int findMissing(int arr[]) {
        int n = arr.length + 1;
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag != 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        System.out.print(findMissing(arr));
    }
}
// ********************* */
// //Better solution:
// import java.util.HashMap;
// class MissingNumberHashMap {
//     public static int findMissing(int[] arr) {
//         int n = arr.length + 1;   // because one number is missing
//         HashMap<Integer, Boolean> map = new HashMap<>();
//         // Step 1: put all array elements into the map
//         for (int num : arr) {
//             map.put(num, true);
//         }
//         // Step 2: check from 1 to n which number is missing
//         for (int i = 1; i <= n; i++) {
//             if (!map.containsKey(i)) {
//                 return i;
//             }
//         }
//         return -1; // should not happen
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 5};
//         System.out.println(findMissing(arr)); // Output: 4
//     }
// }
//Optimal Solution:
// class missingBrute {

//     public static int findMissing(int arr[]) {
//         int n = arr.length + 1;
//         int totalSum = n * (n + 1) / 2;
//         int arrSum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             arrSum += arr[i];
//         }
//         return totalSum - arrSum;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 5};
//         System.out.println(findMissing(arr));
//     }
// }
// //Best Optimal
// class MissingNumberXOR {
//     public static int missingNumber(int[] arr, int N) {
//         int xor1 = 0; // XOR of 1 to N
//         int xor2 = 0; // XOR of array elements
//         // XOR all elements of the array
//         for (int i = 0; i < N - 1; i++) {
//             xor2 = xor2 ^ arr[i];
//             xor1 = xor1 ^ (i + 1);
//         }
//         // XOR with N
//         xor1 = xor1 ^ N;
//         // Missing number
//         return xor1 ^ xor2;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 5};
//         int N = 5;
//         System.out.println(missingNumber(arr, N)); // Output: 4
//     }
// }
