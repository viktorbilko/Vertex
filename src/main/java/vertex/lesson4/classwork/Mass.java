package vertex.lesson4.classwork;

import java.util.Arrays;

/**
 * An array create and fill.
 */
public class Mass {

    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        int [] arr2 = new int[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arr.length + arr2.length];

        for (int i = 0, j=0 ; i < arr3.length ; i++) {
            if (i < arr.length) {
                arr3[i] = arr2[i];
            } else {
                arr3[i] = arr2[j++];
            }
        }

        System.out.println(Arrays.toString(arr3));
    }
}
