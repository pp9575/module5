package org.example.customers;

import org.example.warehouse.Product;
import org.example.warehouse.Warehouse;
import java.util.List;

public interface Customer {

    default void takeProduct(Warehouse warehouse, String product, List<Product> home) {
        warehouse.getProducts().get(product).stream()
                .filter(Product::isBroken)
                .forEach(e -> {
                    home.add(e);
                    warehouse.getProducts().get(product).remove(e);
                });

    }
}
