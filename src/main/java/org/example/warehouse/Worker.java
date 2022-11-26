package org.example.warehouse;

public class Worker {
    private Warehouse warehouse;
    private int productCount;
    public void addProduct(Product... products) {
        for (Product product : products) {
            if (productCount % 2 != 0 ) {
                product.setBroken(true);
            }
            if (product instanceof Vodka) {
                this.warehouse.getProducts().get("Vodka").add(product);
                this.productCount++;
            } else if (product instanceof Bike) {
                this.warehouse.getProducts().get("Bike").add(product);
                this.productCount++;
            }
        }
    }
}
