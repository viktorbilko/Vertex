package vertex.lesson3.classwork;


public class ServiceWhile {

    public static void main(String[] args) {

        int i = 1;
        String odd = "odd";
        String even = "even";

        while (i <= 100){

            if (i%2 == 1){
                System.out.println(i + " " + odd);
            } else {
                System.out.println(i + " " + even);
            }

            i++;

        }
    }
}
