package vertex.lesson3.classwork;

/**
 * Created by vertex0005 on 06.07.2017.
 */
public class Mass {

    public static void main(String[] args) {

        int arr [] = {1, 5 , 7, 10, 15};

        /*for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0)
            System.out.println(arr[i]);
        }*/

        /*int mass [] = {1, 5};

        if (arr.length > mass.length){
            System.out.println("Biggest is arr");
        } else if (arr.length <mass.length){
            System.out.println(" Biggest is mass");
        } else {
            System.out.println("Обидва масиви однокові");
        }
        */

        int array [] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            if (2<=array[i] && array[i]< 5)
                arr[i] = 12;
        }

        int find = 6;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                System.out.println("arr " + i + " consist 6");

            }
        }

    }
}
