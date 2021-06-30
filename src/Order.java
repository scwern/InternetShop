public class Order {
    public void addProduct(Product product){ // добавляем новый продукт.
        Product copy = new Product(product.getName(),product.getPrice());
        // добавляем в заказ.
    }
}
