package org.cioleaflorin;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger {
    private List<Additional> additionals = new ArrayList<>();

    public HealthyBurger(String meet, double price) {
        super("Healthy Burger", "brown rye bread roll", meet, price);
    }}

