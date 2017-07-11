package vertex.lesson4.classwork;

import java.util.Random;

/**
 * Created by vertex0005 on 11.07.2017.
 */
public class TeachRandom {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        Random random = new Random();

        for (int i = 0; i < 5; i++){
            System.out.println(arr[random.nextInt(arr.length)]);
        }


    }
}
