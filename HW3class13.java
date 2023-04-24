package homeWork;

public class HW3class13 {

    // How would you swap  2 strings without a temporary variable?

    public static void swapStrings(String str1, String str2) {

        String concatenated = str1 + "#" + str2;
        String[] strings = concatenated.split("#");

        String temp = strings[0];
        strings[0] = strings[1];
        strings[1] = temp;

        String swappedStr1 = strings[0] + "#";
        String swappedStr2 = strings[1];

        System.out.println("Swapped string 1: " + swappedStr1);
        System.out.println("Swapped string 2: " + swappedStr2);
    }
}
