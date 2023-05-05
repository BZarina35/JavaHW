package homeWork;

public class HW1class13 {

        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */


    public static void main(String[] args) {

        String words = "This is sentence i want to reverse";

        String[] splitArray = words.split(" ");

        for (String arrayWord : splitArray) {
            StringBuilder stb = new StringBuilder(arrayWord);
            System.out.print(stb.reverse().append(" "));
        }

    }

    }


