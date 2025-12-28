
class isSort {

    public static boolean checkIsSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 7, 12, 0, 9};
        int arr1[] = {1, 2, 2, 5, 6, 7};
        System.out.println(checkIsSort(arr1));
        System.err.println(checkIsSort(arr));
    }
}
