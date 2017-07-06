package vertex.lesson3.classwork;

/**
 * Created by vertex0005 on 06.07.2017.
 */
public class ArrOne {

    public static void main(String[] args) {

        int arr [] = new int[10];

        /*int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        while (i-->0) {
            System.out.println(arr[i]);
        }

        int y =10;
        while (y-->0){
            System.out.println(y);
        }
        */

        int count = arr.length;
        int c = 0;

        while (count>0){
            arr[arr.length-c-1] = c;
            System.out.println(c);
            count--;
            c++;
        }

    }
}
