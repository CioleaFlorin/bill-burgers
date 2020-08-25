package org.cioleaflorin;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private String name;
    private String rollType;
    private String meet;
    private double price;
    private List<Additional> additionals = new ArrayList<>();

    public Hamburger(String name, String rollType, String meet, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meet = meet;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeet() {
        return meet;
    }

    public double getPrice() {
        return price;
    }

    public List<Additional> getAdditionals() {
        return additionals;
    }



    public void addAdditional(String name, double price) {

            additionals.add(new Additional(name, price));
            System.out.println("Added addition "+ name+ " with price: " + price + "$");



    }

    public void showOrder(){
        System.out.println("Your order is: ");
        System.out.println("Base price of hamburger: " + getPrice() + "$");
        System.out.println("You chose the additions: ");
        double additionsPrice=0.0;
        for (Additional addition
                : additionals){
            System.out.println(addition.getName()+ ":" + addition.getPrice());
            additionsPrice+=addition.getPrice();
        }
        System.out.println("The total price is: " +(getPrice()+additionsPrice));

    }

    public  void additionals(int option) {
        switch(option){
            case 1:
                addAdditional("lettuce",0.99);
                break;
            case 2:
                addAdditional("tomato", 0.69);
                break;
            case 3:
                addAdditional("carrot", 0.39);
                break;
            case 4:
                addAdditional("onion", 0.79);
                break;
            case 5:
                addAdditional("pickles", 0.59);
                break;
            case 6:
                addAdditional("cucumber", 0.69);
                break;
            case 7:
                addAdditional("cheese", 1.5);
                break;
        }
    }
}
