package org.example.importers;

import org.example.warehouse.*;

public class Absolute implements Importer{
    @Override
    public void giveWarehouse(Warehouse warehouse) {
        warehouse.getZelya().addProduct(new Vodka());
    }
}
