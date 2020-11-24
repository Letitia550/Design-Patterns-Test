public class Main {

    public static void main(String[] args) {
        Phone ph1 = new Phone("iPhone 4s", 200);
        Phone ph2 = new Phone("Samsung Galaxy S5", 198);

        Charger ch1 = new Charger("Thunderbolt", 22);
        Charger ch2 = new Charger("USB Type-C", 8);

        Headphones hp1 = new Headphones("Shure SE 535", 500);
        Headphones hp2 = new Headphones("Empire Ears ODIN", 3000);

        Box b1 = new Box();
        b1.addProduct(ph1);
        b1.addProduct(ch1);

        Box b2 = new Box();
        b2.addProduct(ph2);
        b2.addProduct(ch2);
        b2.addProduct(hp1);
        b2.addProduct(hp2);

        b1.addProduct(b2);

        b1.print();


        // Set the operating system for ph1
        ph1.setOs("iOS");
        ph2.setOs("Android");
        b1.print();

        // Print price of all phones from Box b1
        System.out.println("Price of all phones from b1: " + b1.price("phones"));
        System.out.println("Price of all phones from b1: " + b1.price("headphones"));
        System.out.println("Price of all phones from b1: " + b1.price("chargers"));
    }
}
