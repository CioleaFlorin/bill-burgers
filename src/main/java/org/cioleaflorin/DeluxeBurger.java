package org.cioleaflorin;

import java.util.ArrayList;
import java.util.List;

public class DeluxeBurger extends Hamburger {
    private List<Additional> additionals = new ArrayList<>();

    public DeluxeBurger(String name, String rollType, String meet, double price) {
        super(name, rollType, meet, price);
        this.additionals.add(0,new Additional("drink",0.0));
        this.additionals.add(1,new Additional("chips",0.0));
    }

    @Override
    public void addAdditional(String name, double price) {
        super.addAdditional(name, price);
    }
}
