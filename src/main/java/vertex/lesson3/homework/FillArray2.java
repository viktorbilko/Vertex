package vertex.lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Filling the array through the Scanner
 */
public class FillArray2 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your number for the cell " + i + ":");
            arr[i] = scan.nextInt();
        }

        System.out.println("Your array:" + Arrays.toString(arr));
    }
}
