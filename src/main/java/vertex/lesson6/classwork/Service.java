package vertex.lesson6.classwork;

/**
 * Created by vertex0005 on 18.07.2017.
 */
public class Service {

    public static void main(String[] args) {

        Me me = new Me();
/*        me.setName("Alex");
        me.setSurname("Kok");
        System.out.println(me.getName());
        System.out.println(me.getSurname());

        me.setCity("Kyiv");
        me.setBeer(true);
        System.out.println(me.getCity());
        System.out.println("is love beer" + me.isBeer());*/

        Me me1 = new Me("Alex");
        Me me2 = new Me("Alex","Tim");
        Me me3 = new Me("Alex","Tim", "Lviv");
        Me me4 = new Me("Alex","Tim", "Lviv", true);

        System.out.println(me1.getName());
        System.out.println(me2.getName() + " " + me2.getSurname());
        System.out.println(me3.getName() + " " + me3.getSurname() + " " + me3.getCity());
        System.out.println(me4.getName() + " " + me4.getSurname() + " " + me4.getCity() + " " + me4.isBeer());

    }
}
