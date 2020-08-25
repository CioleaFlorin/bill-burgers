package org.cioleaflorin;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Hamburger baseBurger=new Hamburger("BaseB","BreadType","Beef",16.5);
        Hamburger healthyBurger=new HealthyBurger("Chicken",18.5);
        Hamburger deluxeBurger=new DeluxeBurger("Deluxe","BreadDeluxe","BestBeef",22.5);

        System.out.println("Choose your burger: 1.Base 2.Healthy 3.Deluxe");
        Scanner scanner = new Scanner(System.in);
        int option=scanner.nextInt();
        int picks=0;
        showAditionals();
        if(option==1){
            while(picks!=4){
                int addOption=scanner.nextInt();
                baseBurger.additionals(addOption);
                picks+=1;
            }
            baseBurger.showOrder();
        }
        if (option == 2) {
            while (picks!=6){
                int addOption=scanner.nextInt();
                healthyBurger.additionals(addOption);
                picks+=1;
            }
            healthyBurger.showOrder();

        }
        if(option==3){
            while(picks!=4){
                int addOption=scanner.nextInt();
                deluxeBurger.additionals(addOption);
                picks+=1;
            }
            deluxeBurger.showOrder();
        }




    }


    public static void showAditionals() {
        System.out.println("Choose your additions.");
        System.out.println("1.lettuce: 0.99$");
        System.out.println("2.tomato: 0.69$");
        System.out.println("3.carrot: 0.39$");
        System.out.println("4.onion: 0.79$");
        System.out.println("5.pickles: 0.59$");
        System.out.println("6.cucumber: 0.69$");
        System.out.println("7.cheese: 1.5$");
    }



}
