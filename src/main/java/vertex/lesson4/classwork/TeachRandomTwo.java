package vertex.lesson4.classwork;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vertex0005 on 11.07.2017.
 */
public class TeachRandomTwo {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int [] mas = new int[arr.length];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            mas[i] = random.nextInt(arr.length);
        }

        System.out.println(Arrays.toString(mas));
    }
}

