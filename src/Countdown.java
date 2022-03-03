public class Countdown {
    public static void main(String[] args) {

        int first = 45;


        countDown(first);
    }

    public static void countDown (int first) {
        while (first !=0) {
            System.out.println(first);
            first--;
        }
    }
}
