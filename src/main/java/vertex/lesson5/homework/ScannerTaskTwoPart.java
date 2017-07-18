package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by User on 17.07.2017.
 */
public class ScannerTaskTwoPart {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Task №5");
        System.out.println("Take double from the console and output the integer");
        System.out.println("Enter double from the console");
        double x = scan.nextDouble();
        System.out.println(transformDoubleToInteger(x));

        System.out.println("Task №6");
        System.out.println("Enter a fractional monetary number and output the money number in pennies");
        System.out.println("Enter UAH from the console");
        float x2 = scan.nextFloat();
        System.out.println(outputPennies(x2) + " pennies");
    }

    private static int transformDoubleToInteger(double x3) {
        return ((int) x3);
    }

    private static int outputPennies(float x) {
        int integer = (int)x;
        int res = (int)((x - (float)integer)*100);
        return res;
    }
}
