package org.example.dz1.customers;

import org.example.dz1.warehouse.Product;
import org.example.dz1.warehouse.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Reshar implements Customer {
    List<Product> home = new ArrayList<>();

    public void takeProduct(Warehouse warehouse) {
        Customer.super.takeProduct(warehouse, "Bike", this.home);
    }
}
