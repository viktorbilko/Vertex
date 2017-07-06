package vertex.lesson3.classwork;

/**
 * Created by vertex0005 on 06.07.2017.
 */
public class ArraysChar {

    public static void main(String[] args) {

        char [] mas = {'a', 'b', 'c'};
        int [] arr = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
            arr[i] = (int)mas[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
