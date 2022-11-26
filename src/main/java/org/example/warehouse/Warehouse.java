package org.example.warehouse;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
public class Warehouse {
    private HashMap<String, List<Product>> products;
    private Worker Zelya = new Worker();
    private Worker Mishka = new Worker();

    public Warehouse() {
        this.products = new HashMap<>();
        this.products.put("Vodka", new ArrayList<>());
        this.products.put("Bike", new ArrayList<>());
        }

    }

