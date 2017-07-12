package vertex.lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by User
 */
public class Programs {


    public static void main(String[] args) {

            System.out.println("Enter the number of program!");

            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();

            scanner.close();

            switch (number) {
                case 1:
                    addSmile();
                    break;
                case 2:
                    addNumberInArray();
                    break;
                case 3:
                    addNumbersWithRandom();
                    break;
                case 4:
                    System.out.println(setUser());
                    break;
                case 5:
                    createUsers();
                    break;
                default:
                    System.out.println("This code is not correct");
            }
    }

    private static void addSmile(){
        String [] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "-:)";
        }

        System.out.println(Arrays.toString(arr));
    }


    private static void addNumberInArray(){
        int [] mas = new int[10];

        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + random.nextInt(10);
        }

        System.out.println(Arrays.toString(mas));
    }

    private static void addNumbersWithRandom(){
        Random random = new Random();
        
        int [] mas = new int[random.nextInt(10)];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int cell : mas) {
            System.out.println(cell);
        }
    }

    private static String setUser(){
        User user = new User();
        user.setName("Ali");
        return user.getName();
    }

    private static void createUsers (){
        User bil = new User();
        User scot = new User();
        User tom = new User();

        bil.setName("Bil");
        scot.setName("Scot");
        tom.setName("Tom");


        User users[] = new User[3];
        users[0] = bil;
        users[1] = scot;
        users[2] = tom;;

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName());
        }
    }
}
