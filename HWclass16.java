package homeWork;

public class HWclass16 {

        /*
Create a method that will accept a String as a parameter and return a new String
that consist only of vowels. Method should be available inside the class only where it
 was declared and executed by calling it is name
     */

    private static String getVowels(String input) {
        StringBuilder vowels = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String vowelString = getVowels(input);
        System.out.println("Vowel string: " + vowelString);
    }
}


