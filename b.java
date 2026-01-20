
class Main {

    // Brute-force: O(n^2) time, O(1) space
    public static int maxsub(int[] arr) {
        int n = arr.length;
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            int ones = 0;
            int zeros = 0;

            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                if (zeros == ones) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 1, 0, 1, 1, 0};
        System.out.println(maxsub(arr)); // Should print 8
    }
}
