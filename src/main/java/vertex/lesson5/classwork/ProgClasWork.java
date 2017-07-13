package vertex.lesson5.classwork;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by vertex0005 on 13.07.2017.
 */
public class ProgClasWork {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        /*System.out.println("Enter the number of program!");

        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 1:
                Scanner ask = new Scanner(System.in);
                System.out.println("Enter the double number");
                System.out.println(transformDoubleToInt(Double.parseDouble(scanner.nextLine())));
                break;
            case 2:
                System.out.println("Enter the int number");
                System.out.println(transformIntToDouble(Integer.parseInt(scanner.nextLine())));
                break;
            case 3:
                System.out.println("Enter the number ");
                System.out.println(transformStringToInt(scanner.nextLine()));
                break;
            case 4:
                System.out.println("Enter the number ");
                System.out.println(transformIntToString(Integer.parseInt(scanner.nextLine())));
                break;
            case 5:
                System.out.println("Enter the double number ");
                System.out.println(transformDoubleToString(Double.parseDouble(scanner.nextLine())));
                break;
            case 6:
                System.out.println("Enter the double number ");
                System.out.println(transformStringToDouble(scanner.nextLine()));
            case 7:
                System.out.println("Enter the double number ");
                double v = (Double.parseDouble(scanner.nextLine()));
                System.out.println(transfotmDoubleToIntToString(v));
                break;
            default:
                System.out.println("This code is not correct");
        }

        System.out.println(gipotenuz());
        addNumbersWithRandom();
        printNumbersWithRandom();
        addNumbersWithRandom2();*/
        masRandom ();
    }

    private static int transformDoubleToInt (double d) {
        int x = (int) d;
        return x;
    }

    private static double transformIntToDouble(int i) {
        double x = i;
        return x;
    }


    private static int transformStringToInt(String s) {
        int x = Integer.parseInt(s);
        return x;
    }

    private static String transformIntToString(int i) {
        String x = i + "";
        return x;
    }


    private static String transformDoubleToString(double v) {
        String x = v + "";
        return x;
    }

    private static double transformStringToDouble(String s) {
        double x = Double.parseDouble(s);
        return x;
    }


    private static String transfotmDoubleToIntToString(double v) {
        int x = transformDoubleToInt(v);
        String str = transformIntToString(x);
        return str;
    }

    private static int gipotenuz(){
        int a = 3;
        int b = 4;
        int c =(int)Math.sqrt(a*a + b*b);
        return c;
    }

    private static void addNumbersWithRandom(){

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(100);
            if (x%2==0)
                System.out.println(x);
        }
    }

    private static void printNumbersWithRandom(){
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(100);

            switch (x) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println(x);
                    break;
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    System.out.println(x);
                    break;
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
            }
        }
    }

    private static void addNumbersWithRandom2(){

        int [] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int cell : mas) {
            System.out.println(cell);
        }
    }

    private static void masRandom (){
        int [] mas = {1,2,3,4,5}; // todo replace values from file
        int len = mas.length;

        int [] arr1 = new int [5]; // fixme
        int [] arr2 = new int [len];
        int [] arr3 = new int[len];
        int [] arr4 = new int[len];
        int [] arr5 = new int[len];

        switch (random.nextInt(len - 1)){
            case 0:
                arr1[random.nextInt(4)] = mas[random.nextInt(4)];
                findMethod(arr1);
                break;
            case 1:
                arr2[random.nextInt(4)] = mas[random.nextInt(4)];
                findMethod(arr2);
                break;
            case 2:
                arr3[random.nextInt(4)] = mas[random.nextInt(4)];
                findMethod(arr3);
                break;
            case 3:
                arr4[random.nextInt(4)] = mas[random.nextInt(4)];
                findMethod(arr4);
                break;
            case 4:
                arr5[random.nextInt(4)] = mas[random.nextInt(4)];
                findMethod(arr5);
                break;
        }
    }

    private static void findMethod(int[] mas) {
        int i = random.nextInt(2);

        switch (i) {
            case 0:
                print(mas);
                break;
            case 1:
                print2(mas);
                break;
            case 2:
                print3(mas);
                break;
        }
    }

    private static void print3(int [] mas) {
        System.out.println(mas);
    }

    private static void print2(int[] mas) {
        System.out.println(mas);
    }

    private static void print(int[] mas) {
        System.out.println(mas);
    }
}