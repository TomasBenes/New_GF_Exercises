package com.company;

import java.util.ArrayList;

public class OnlineOrder extends Order {
    private String address;

    public OnlineOrder (String address, ArrayList<Dish> dishes) {
        super(dishes);
        this.address = address;

    }

}
