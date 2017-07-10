package vertex.lesson3.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Check the number in the array
 */
public class SearchArray1 {

    public static void main(String[] args) {

        Random random = new Random();

        int [] arr = new int[10];
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Enter the number you are looking for");

        Scanner scan = new Scanner(System.in);
        int find = scan.nextInt();

        for (int i = 0; i < len; i++) {
            if (find == arr[i]) {
                System.out.println("The number " + find + "is present in the array");
                break;
            }

            if (i == (len-1))
                System.out.println("The number " + find + " is absent in the array");
        }
    }
}
