public class Phone implements Product {
    private String name;
    private int price;
    private String os;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        if( os != null ) {
            System.out.println("@" + os + " Name: " + name + ", Price: " + price);
        } else {
            System.out.println("Name: " + name + ", Price: " + price);
        }
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public int price(String category) {
        if (category.equals("phones")) {
            return price;
        } else {
            return 0;
        }
    }
}
