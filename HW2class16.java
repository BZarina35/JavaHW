package homeWork;

public class HW2class16 {

    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
    */

    public static String reversedString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }


    public static void main(String[] args) {
        String input = "Why Java is Hard?";
        String reversed = HW2class16.reversedString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
