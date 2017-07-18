package vertex.lesson5.homework;

import java.util.Scanner;

/**
 *
 */
public class ScannerTask {

    private static Scanner scan = new Scanner(System.in);
    private static int x1, x2;
    private static double x3;

    public static void main(String[] args) {

        System.out.println("Task №1");
        System.out.println("Take the integer from the console, display twice on the screen");
        System.out.println("Enter an integer from the console");
        x1 = scan.nextInt();
        System.out.println(displayTwice(x1));


        System.out.println("Task №2");
        System.out.println("Take two integers from the console and output in the reverse order");
        System.out.println("Enter integers from the console");
        x1 = scan.nextInt();
        x2 = scan.nextInt();
        outputReserseOrder(x1, x2);

        System.out.println("Task №3");
        System.out.println("Take two integers from the console and output the amount");
        System.out.println("Enter integers from the console");
        x1 = scan.nextInt();
        x2 = scan.nextInt();
        System.out.println(outputAmount(x1, x2));
    }

    private static int outputAmount(int x1, int x2) {
        return x1+x2;
    }

    private static void outputReserseOrder(int x1, int x2) {
        System.out.println(x2);
        System.out.println(x1);
    }

    public static int displayTwice (int i){
        return i * 2;
    }
}
