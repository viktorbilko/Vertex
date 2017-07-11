package vertex.lesson4.classwork;

/**
 * Created by vertex0005 on 11.07.2017.
 */
public class LearnMethod {

    public static void main(String[] args) {
        just();

    }

    private static void justLast(String tom, String cut) {
        System.out.println(tom + " " + cut);
    }

    private static void just (){
        System.out.println("1");
        justTwo(12);
    }

    private static void justTwo (int i){
        System.out.println(i);
        System.out.println(justFour(false));
    }

    private static String justThree (){
        System.out.println(justFour(false));
        return "Hello 3";
    }

    private static int justFour (boolean name){
        System.out.println(sum(5, 10));
        if (name){
            return 0;
        } else {
            return -1;
        }
    }

    private static int sum (int a, int b){
        System.out.println(justNon(5, 3));
        return a + b;
    }

    private static boolean justNon (int a, int b){
        justLast("Tom", "Cut");
        return a < b;
    }

}
