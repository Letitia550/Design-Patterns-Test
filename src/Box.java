import java.util.ArrayList;
import java.util.List;

public class Box implements Product{
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public void removeEmployee(Product prod)
    {
        products.remove(prod);
    }

    @Override
    public void print() {
        for(Product prod : products) {
            prod.print();
        }
    }

    @Override
    public int price(String category) {
        int price = 0;


        for(Product prod : products) {
            price += prod.price(category);
        }

        return price;
    }
}
