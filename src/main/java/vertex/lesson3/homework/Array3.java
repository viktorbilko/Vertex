package vertex.lesson3.homework;

import java.util.Scanner;

/**
 * The program asks for the number. This number specifies the size of the array and fill the array.
 */
public class Array3 {

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your number:");
            number = scanner.nextInt();
        } while (number <= 0);


        int [] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = number;
        }

        for (int x : arr) {
            System.out.print(x + ",");
        }
    }
}
