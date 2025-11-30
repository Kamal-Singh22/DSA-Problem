//Brute force: First sort the array and then compare the largest with the (n-2)!=largest.because 
// we have the multiple largese number like 1,2,3,3,3.so start the loop from n-2 and go till 0.

// Optimal solution TC O(N)
class secondLargest {

    public static int secondLargestNumber(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {1, 22, 11, 45, 50, 55, 60, 58};
        System.out.println(secondLargestNumber(arr));
    }

}

//Main logic for the brute force
// sort the arrar first and then
// for(int i=n-1;i>=0;i--){
//     if(arr[i]!=largest){
//         return arr[i];
//     }
// }
