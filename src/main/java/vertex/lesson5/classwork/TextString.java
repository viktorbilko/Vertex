package vertex.lesson5.classwork;

/**
 * Created by vertex0005 on 13.07.2017.
 */
public class TextString {

    public static void main(String[] args) {

        String text = "Welcome to Ukraine";

        /*text.equals("Welcome");

        text.compareTo("");

        text.compareToIgnoreCase("Welcome");

        text.endsWith("me");

        text.startsWith("We");

        System.out.println(text.length());

        text.replace("W", "w");

        String result = text.replaceAll("[W,e,l,c,o,m,e}", "beer");
        System.out.println(result);

        text = "Welcome to Ukraine";

        String[] split = text.split(" ");

        text.toUpperCase();
        text.toLowerCase();*/

        char[] chars = text.toCharArray();

        int sum = 0;


        for (char i : chars) {
            sum += i;
        }

        System.out.println(sum);



        //System.out.println(split[2]);

    }
}
