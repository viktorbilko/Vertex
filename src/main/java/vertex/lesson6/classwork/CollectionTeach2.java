package vertex.lesson6.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vertex0005 on 18.07.2017.
 */
public class CollectionTeach2 {

    public static void main(String[] args) {

        List<Integer> listId = new ArrayList<>();
        listId.add(1);
        listId.add(5);
        listId.add(5);

        List<Integer> list = new ArrayList<>();


        list.addAll(listId);

        list.forEach(System.out::println);

        System.out.println(list.isEmpty());


    }
}
