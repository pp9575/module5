package org.example.dz1.importers;
import org.example.dz1.warehouse.Bike;
import org.example.dz1.warehouse.Warehouse;

public class Aist implements Importer {
    @Override
    public void giveWarehouse(Warehouse warehouse) {
       warehouse.getMishka().addProduct(new Bike());
    }
}
