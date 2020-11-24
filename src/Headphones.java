public class Headphones implements Product {
    private String name;
    private int price;

    public Headphones(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + ", Price: " + price);
    }

    @Override
    public int price(String category) {
        if(category.equals("headphones")) {
            return price;
        } else {
            return 0;
        }
    }
}
