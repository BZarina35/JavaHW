package homeWork;

import java.util.HashMap;
import java.util.Map;

public class HW1class14 {

    /*
     Create a method that will say Hello in different language based on the country that will be passed
     when method is executed. Create a method createEmail(). Based on values of users firstName,
     lastName and email type, your method should return complete email Address.
      Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com Write a method to return whether
       given number is prime or not? Create  class Student that will have a method getGrade.
        Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */

    public static void main(String[] args) {
        // Say hello in different languages
        System.out.println(sayHello("united states"));  // Output: Hello
        System.out.println(sayHello("germany"));  // Output: Guten Tag
        System.out.println(sayHello("brazil"));  // Output: Hello (default greeting)

        // Create email addresses
        System.out.println(createEmail("John", "Snow", "gmail"));  // Output: johnsnow@gmail.com

        // Check if a number is prime
        System.out.println(isPrime(37));  // Output: true
        System.out.println(isPrime(10));  // Output: false

        // Get grade based on score
        Student student = new Student();
        System.out.println(student.getGrade(85));  // Output: B
        System.out.println(student.getGrade(60));  // Output: D
        System.out.println(student.getGrade(95));  // Output: A
    }

    public static String sayHello(String country) {
        country = country.toLowerCase();

        Map<String, String> greetings = new HashMap<>();
        greetings.put("united states", "Hello");
        greetings.put("united kingdom", "Hello");
        greetings.put("france", "Bonjour");
        greetings.put("germany", "Guten Tag");
        greetings.put("spain", "Hola");
        greetings.put("italy", "Ciao");
        greetings.put("japan", "Konnichiwa");
        greetings.put("china", "Ni hao");
        greetings.put("india", "Namaste");
        // Add more greetings for other countries as needed

        if (greetings.containsKey(country)) {
            return greetings.get(country);
        } else {
            return "Hello";  // Default greeting if country is not found
        }
    }

    public static String createEmail(String firstName, String lastName, String emailType) {
        String email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
        return email;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static class Student {
        public String getGrade(int score) {
            if (score > 90) {
                return "A";
            } else if (score > 80) {
                return "B";
            } else if (score > 70) {
                return "C";
            } else if (score > 50) {
                return "D";
            } else {
                return "F";
            }
        }
    }
}


