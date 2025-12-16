
class maxCons1s {

    public static int maximumCons1s(int arr[]) {
        int n = arr.length;
        int max = 0;
        int consacutive = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                consacutive++;
                max = Math.max(max, consacutive);
            } else {
                consacutive = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
        System.out.println(maximumCons1s(arr));
    }
}
