package vertex.lesson6.classwork;

/**
 * Created by vertex0005 on 18.07.2017.
 */
public class People extends Hobby {

    @Override
    public void read() {
        System.out.println("Book by People");
    }

    @Override
    public void write() {
        System.out.println("Esse");
    }

    @Override
    public void eat() {
        System.out.println("mushroom");
    }
}
