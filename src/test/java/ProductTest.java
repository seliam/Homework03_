import junit.framework.TestCase;

public class ProductTest extends TestCase {

    public void testGetPrice() {
        Product product = new Product(100);
        assertEquals(100.0, product.getPrice() );
    }

    public void testApplycoupon() {
        Product product = new Product(100.0);
        assertEquals( 90.0, product.applycoupon(10));
    }

    public void testApplyDiscount() {
        Product product = new Product(100.0);
        product.applyDiscount(20.0);
        assertEquals( 80.0, product.getPrice());
        product.applyDiscount(-20);
        assertEquals(80.0, product.getPrice(), 0.01);
        product.applyDiscount(102.0);
        assertEquals( 80.0,product.getPrice(), 0.01);
    }

    public void testIncreasePrice() {
        Product product = new Product(100.0);
        product.increasePrice(10.0);
        assertEquals( 110.0,product.getPrice(), 0.01);
        product.increasePrice(-10.0);
        assertEquals( 110.0,product.getPrice(), 0.01);
    }

}