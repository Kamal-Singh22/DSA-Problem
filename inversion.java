
class inversion {

    public static int inversion1(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 1};
        int res = inversion1(arr);
        System.out.print(res);
    }
}
