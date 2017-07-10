package vertex.lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Integer array transform into a string array;
 */
public class ArrayIntToString4 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.println("Enter your numbers:");

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        String [] str = new String[arr.length];

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        System.out.println(Arrays.toString(str));
    }
}
