package com.nest.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        int total=0,choice,n,i,mode;
        Scanner input=new Scanner(System.in);
        ArrayList<String> purchase=new ArrayList<String>();
        ArrayList<Integer> numberOf=new ArrayList<Integer>();
        ArrayList<Integer> price=new ArrayList<Integer>();
        ArrayList<Integer> sum=new ArrayList<Integer>();
        FoodItems foodItems=new FoodItems(40,51,55,70,51);
        FoodItems takeawayFoodItems = new FoodItems(34,23,56,67,66);
        System.out.println("select mode");
        System.out.println("1.dinein");
        System.out.println("2.takeaway");
        System.out.println("3.exit");
        mode=input.nextInt();



            switch (mode) {
                case 1:
                    while (true) {
                        System.out.println("select option");
                        System.out.println("\t\t\t***MENU***");
                        System.out.println("\t\t\t   ====");
                        System.out.println("1. Tea  " + foodItems.getTea());
                        System.out.println("2. Coffee " + foodItems.getCoffee());
                        System.out.println("3. Espresso " + foodItems.getEspresso());
                        System.out.println("4. Cold-Coffee " + foodItems.getColdCoffee());
                        System.out.println("5. Ice Tea   " + foodItems.getIceTea());
                        System.out.println("6. \t\tPRINT BILL");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Number of Tea");
                                n = input.nextInt();
                                total = total + (n * foodItems.getTea());
                                purchase.add("Tea");
                                numberOf.add(n);
                                price.add(foodItems.getTea());
                                sum.add(n * foodItems.getTea());
                                break;
                            case 2:
                                System.out.println("Number of Coffee");
                                n = input.nextInt();
                                total = total + (n * foodItems.getCoffee());
                                purchase.add("Coffee ");
                                numberOf.add(n);
                                price.add(foodItems.getCoffee());
                                sum.add(n * foodItems.getCoffee());
                                break;
                            case 3:
                                System.out.println("Number of Espresso (Black)");
                                n = input.nextInt();
                                total = total + (n * foodItems.getEspresso());
                                purchase.add("Espresso (Black)");
                                numberOf.add(n);
                                price.add(foodItems.getEspresso());
                                sum.add(n * foodItems.getEspresso());
                                break;
                            case 4:
                                System.out.println("Number of Cold-Coffee ");
                                n = input.nextInt();
                                total = total + (n * foodItems.getColdCoffee());
                                purchase.add("Cold-Coffee ");
                                numberOf.add(n);
                                price.add(foodItems.getColdCoffee());
                                sum.add(n * foodItems.getColdCoffee());
                                break;
                            case 5:
                                System.out.println("Number of Ice Tea ");
                                n = input.nextInt();
                                total = total + (n * foodItems.getIceTea());
                                purchase.add("Ice Tea ");
                                numberOf.add(n);
                                price.add(foodItems.getIceTea());
                                sum.add(n * foodItems.getIceTea());
                                break;
                            case 6:
                                System.out.println("\t\t\t***BILL***");
                                System.out.println("\t\t\t   ====");
                                for (i = 0; i < purchase.size(); i++) {
                                    System.out.println(i + 1 + ". " + purchase.get(i) + "   " + numberOf.get(i) + " * " + price.get(i) + " = " + sum.get(i));
                                }
                                System.out.println("\t\t\t\t\tTOTAL= " + total + "/-");
                                System.out.println("\t\t\t\t\t===========");
                                System.exit(0);
                        }

                    }
                case 2:
                        while (true) {
                            System.out.println("select option");
                            System.out.println("\t\t\t***MENU***");
                            System.out.println("\t\t\t   ====");
                            System.out.println("1. Tea  " + takeawayFoodItems.getTea());
                            System.out.println("2. Coffee " + takeawayFoodItems.getCoffee());
                            System.out.println("3. Espresso " + takeawayFoodItems.getEspresso());
                            System.out.println("4. Cold-Coffee " + takeawayFoodItems.getColdCoffee());
                            System.out.println("5. Ice Tea   " + takeawayFoodItems.getIceTea());
                            System.out.println("6. \t\tPRINT BILL");
                            choice = input.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("Number of Tea");
                                    n = input.nextInt();
                                    total = total + (n * takeawayFoodItems.getTea());
                                    purchase.add("Tea");
                                    numberOf.add(n);
                                    price.add(takeawayFoodItems.getTea());
                                    sum.add(n * takeawayFoodItems.getTea());
                                    break;
                                case 2:
                                    System.out.println("Number of Coffee");
                                    n = input.nextInt();
                                    total = total + (n * takeawayFoodItems.getColdCoffee());
                                    purchase.add("Coffee ");
                                    numberOf.add(n);
                                    price.add(takeawayFoodItems.getColdCoffee());
                                    sum.add(n * takeawayFoodItems.getColdCoffee());
                                    break;
                                case 3:
                                    System.out.println("Number of Espresso (Black)");
                                    n = input.nextInt();
                                    total = total + (n * takeawayFoodItems.getEspresso());
                                    purchase.add("Espresso (Black)");
                                    numberOf.add(n);
                                    price.add(takeawayFoodItems.getEspresso());
                                    sum.add(n * takeawayFoodItems.getEspresso());
                                    break;
                                case 4:
                                    System.out.println("Number of Cold-Coffee ");
                                    n = input.nextInt();
                                    total = total + (n * takeawayFoodItems.getColdCoffee());
                                    purchase.add("Cold-Coffee ");
                                    numberOf.add(n);
                                    price.add(takeawayFoodItems.getColdCoffee());
                                    sum.add(n * takeawayFoodItems.getColdCoffee());
                                    break;
                                case 5:
                                    System.out.println("Number of Ice Tea ");
                                    n = input.nextInt();
                                    total = total + (n * takeawayFoodItems.getIceTea());
                                    purchase.add("Ice Tea ");
                                    numberOf.add(n);
                                    price.add(takeawayFoodItems.getIceTea());
                                    sum.add(n * takeawayFoodItems.getIceTea());
                                    break;
                                case 6:
                                    System.out.println("\t\t\t***BILL***");
                                    System.out.println("\t\t\t   ====");
                                    for (i = 0; i < purchase.size(); i++) {
                                        System.out.println(i + 1 + ". " + purchase.get(i) + "   " + numberOf.get(i) + " * " + price.get(i) + " = " + sum.get(i));
                                    }
                                    System.out.println("\t\t\t\t\tTOTAL= " + total + "/-");
                                    System.out.println("\t\t\t\t\t===========");
                                    System.exit(0);
                                    }
                                }
                case 3:
                    System.exit(0);
            }}}


