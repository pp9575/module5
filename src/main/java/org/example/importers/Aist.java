package org.example.importers;
import org.example.warehouse.Bike;
import org.example.warehouse.Warehouse;

public class Aist implements Importer {
    @Override
    public void giveWarehouse(Warehouse warehouse) {
       warehouse.getMishka().addProduct(new Bike());
    }
}
