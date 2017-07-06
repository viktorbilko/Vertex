package vertex.lesson3.classwork;

/**
 * Created by vertex0005 on 06.07.2017.
 */
public class AllForWhile {

    public static void main(String[] args) {

        int trace = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println(trace++);
        }

        while (trace < 5){
            System.out.println(trace++);
        }
    }
}
