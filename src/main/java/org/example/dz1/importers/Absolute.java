package org.example.dz1.importers;

import org.example.dz1.warehouse.Vodka;
import org.example.dz1.warehouse.Warehouse;

public class Absolute implements Importer{
    @Override
    public void giveWarehouse(Warehouse warehouse) {
        warehouse.getZelya().addProduct(new Vodka());
    }
}
