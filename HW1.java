package HomeWork;

public class HW1 {

    public static void main(String[] args) {

        /*
        Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an array). */

        char[] symbols = {'A', 'B', 'C', 'D'};
        System.out.println(symbols[1]);

        System.out.println();

        char[] grades = new char[4];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';
        grades[3] = 'D';
        System.out.println(grades[1]);

        /* Create an array of names and store all names of your group. Then print your name from that array.
        (use 2 different ways of creating an array) */

        String[] names = {"Tamara", "Zarina", "Nigina", "Karina", "Halima"};
        System.out.println(names[1]);

        System.out.println();

        String[] names2 = {"Tamara", "Zarina", "Nigina", "Karina", "Halima"};
        names2[0] = "Tamara";
        names2[1] = "Zarina";
        names2[2] = "Nigina";
        names2[3] = "Karina";
        names2[4] = "Halima";
        System.out.println(names2[1]);


        /* Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array:
         “Saturday is Java coding day” */

        String[] words = {"Java", "Saturday", "day", "coding", "is"};
        System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);


        /*
        Create an array of cars and store 6 elements into it. Using 2 different loops print all values
        from the array */

        String[] cars = {"BMW", "Toyota", "Mazda", "Honda", "Ford", "Mercedes"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();

        for (String car : cars) {
            System.out.print(car + " ");
        }

        System.out.println();

        /* Create an array of animals and store 5 elements into it. Using 2 different loops print
         all elements from the array. */

        String[] animals = {"dog", "cat", "lion", "tiger", "leopard"};
        for (int j = 0; j < animals.length; j++) {
            System.out.print(animals[j] + " ");

        }
        for (String animal : animals) {
            System.out.print(animal+ " ");
        }

        System.out.println();

        // Create an array on integers and calculate the sum of all elements in an array

        int [] num = {3, 5, 7, 15, 8};
        int sum =0;
        for (int k = 0; k < num.length ; k++) {
            sum += num[k];
        }
        System.out.println(sum);


        // From an array of integer elements find the largest number.

        int[] numbers = {5, 7, 3, 8, 9};

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);

        // Create an array to store char values and then print those in reverse order

        char[] letters = {'a', 'b', 'c', 'd', 'e'};

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }

}

