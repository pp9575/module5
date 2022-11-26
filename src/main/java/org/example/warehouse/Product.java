package org.example.warehouse;

import lombok.Data;

@Data
abstract public class Product {
    private boolean isBroken = false;
}
