// “Maximum XOR of all subarrays of size k”
// “Sliding window XOR maximum”

class maximumXOR {

    public static int Xor(int arr[], int k) {
        int maxSub = 0;
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            int currXor = 0;
            for (int j = 0; j < k; j++) {
                currXor ^= arr[i + j];
            }
            if (currXor > maxSub) {
                maxSub = currXor;
            }
        }
        return maxSub;
    }

    public static void main(String[] asdf) {
        int arr[] = {2, 5, 8, 1, 1, 3};
        int k = 3;
        int res = Xor(arr, k);
        System.out.print(res);
    }

}
