package vertex.lesson6.classwork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vertex0005 on 18.07.2017.
 */
public class CollectionTeach {
    public static void main(String[] args) {


        List<Integer> listId = new ArrayList<>();
        listId.add(1);
        listId.add(5);

        List <String> list = new ArrayList<>();
        list.add("Vasia");
        list.add("Alex");
        list.add("Tom");

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
