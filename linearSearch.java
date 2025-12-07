
class linearSearch {

    public static int searchNum(int arr[], int num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 10};
        int arr1[] = {11, 22, 33, 44, 55};
        System.out.println(searchNum(arr, 10));
        System.out.println(searchNum(arr1, 10));
    }
}
