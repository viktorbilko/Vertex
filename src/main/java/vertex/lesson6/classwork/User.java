package vertex.lesson6.classwork;

/**
 * Created by vertex0005 on 18.07.2017.
 */
public class User extends Runner {

    public static void main(String[] args) {

        User user = new User();
        user.run();
    }

    @Override
    public void run() {
        System.out.println("7km");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
