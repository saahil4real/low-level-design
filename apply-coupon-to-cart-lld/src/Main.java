import products.Item1;
import products.Product;
import products.ProductType;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("FAN", 1000, ProductType.ELECTRONIC_GOODS);
        Product item2 = new Item1("SOFA", 10000, ProductType.FURNITURE_GOODS);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println("Total Price after discount: " + cart.getTotalPrice());
    }
}