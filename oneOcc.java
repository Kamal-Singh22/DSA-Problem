
//find the number that occur once and other occure twice 
//Optimal solution:
class oneOcc {

    public static int singleOccurance(int arr[]) {
        int n = arr.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(singleOccurance(arr));
    }
}

//Brute force approach:
class oneOccBrute {

    public static int singleOccurrence(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }

        return -1; // should not happen normally
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(singleOccurrence(arr)); // 5
    }
}
