public class Bedingungen {
    public static void main(String[] args) {
        boolean senior = true;
        boolean dog = false;
        boolean student = false;
        double ticket = 2.50;
        double discount = getDiscount(ticket, senior, dog, student);

        System.out.println("I saved " + discount + "Euro for my" + ticket + " Euro Ticket");


    }


    public static double getDiscount(double ticket, boolean senior, boolean dog, boolean student) {
        double discount;
        if (senior) {
            //discount = ticket - ticket * 0.8
            discount = ticket * 0.2;
        } else if (dog) {
            discount = ticket * 0.15;
        } else if (student) {
            discount = ticket * 0.1;
        } else {
            discount = 0;
            System.out.println("I get a discount " + discount + " Euro " + " for my 2.50 Euro ticket");
        }
        return discount;
    }
}

