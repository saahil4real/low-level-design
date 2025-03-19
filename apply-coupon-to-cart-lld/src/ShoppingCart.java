import coupons.PercentageCouponDecorator;
import coupons.TypeCouponDecorator;
import products.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product productWithEligibleDiscount =
                new TypeCouponDecorator(
                        new PercentageCouponDecorator(product, 10), 3, product.getType());
        productList.add(productWithEligibleDiscount);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for(Product product : productList) {
            totalPrice += (int) product.getPrice();
        }
        return totalPrice;
    }

}
