public class Bedingungen {
    public static void main(String[] args) {
        boolean senior = false;
        boolean dog = false;
        boolean student = false;
        double discount;
        double ticket = 2.50;


        if (senior) {
            //discount = ticket - ticket * 0.8
            discount = ticket * 0.2;
        } else if (dog) {
            discount = ticket * 0.15; }
            else if (student) {
                discount = ticket * 0.1; }
                else {
                    discount = 0;
            System.out.println("I get a discount " + discount + " Euro " + " for my 2.50 Euro ticket");
                }

        }


}
