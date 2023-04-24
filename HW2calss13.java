package homeWork;

public class HW2calss13 {

    public static boolean isPalindrome(String input) {

        /*
        How would you check if String is palindrome or not? aba=> true  Abbc =>false
         */

        input = input.toLowerCase();

        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
            return true;
    }

}