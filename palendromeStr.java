
class palendromeStr {

    public static boolean isPalendrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;

            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] asdf) {
        String s = "qkwewq";
        String s2 = "qweewq";
        String s3 = "Was it a car or a cat I saw?";
        System.out.println(isPalendrome(s));

        System.out.println(isPalendrome(s2));
        System.out.println(isPalendrome(s3));
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         // Step 1: Clean the string: keep only alphanumeric and make lowercase
//         String cleaned = "";
//         for (char c : s.toCharArray()) {
//             if (Character.isLetterOrDigit(c)) {
//                 cleaned += Character.toLowerCase(c);
//             }
//         }
//         // Step 2: Two pointer check
//         int left = 0;
//         int right = cleaned.length() - 1;
//         while (left < right) {
//             if (cleaned.charAt(left) != cleaned.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }
