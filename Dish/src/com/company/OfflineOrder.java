package com.company;

import java.util.ArrayList;

public class OfflineOrder extends Order {
    private int table;

    public OfflineOrder (int table, ArrayList<Dish> dishes) {
        super(dishes);
        this.table = table;
    }
}
