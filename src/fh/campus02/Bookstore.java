package fh.campus02;

public class Bookstore {
    public static void main(String[] args) {


    int nonFiction = 3;
    int fiction = 1;
    boolean discount;

    if ((nonFiction > 2) && (fiction >= 1)) {
            discount = true;
        }
        else {
            discount = false;
        }

        System.out.println(discount);
    }
}
