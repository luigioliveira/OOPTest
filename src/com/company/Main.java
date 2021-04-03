package com.company;

public class Main {

    public static void main(String[] args) {

//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        hamburger.addHamburgerAddition1("Tomato", 0.49);
//        System.out.println(hamburger.statusOrder());
//        hamburger.addHamburgerAddition2("Lettuce", 0.79);
//        hamburger.addHamburgerAddition3("Carrot", 0.59);
//        hamburger.addHamburgerAddition4("Bacon", 1.49);
//        System.out.println("Grand Total: " + hamburger.itemizeHamburger());


//        HealthyBurger healthyBurger = new HealthyBurger("Grilled chicken", 5.98);
//        healthyBurger.addHamburgerAddition1("Tomato", 0.49);
//        healthyBurger.addHamburgerAddition2("Lettuce", 0.79);
//        healthyBurger.addHamburgerAddition3("Carrot", 0.59);
//        healthyBurger.addHamburgerAddition4("Bacon", 1.49);
//        System.out.println(healthyBurger.statusOrder());
//        healthyBurger.addHealthyExtra1("Green corn", 1.99);
//        healthyBurger.addHealthyExtra2("Pea", 1.99);
//        System.out.println("\nGrand Total: " + healthyBurger.itemizeHamburger());

//
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Tomato", 0.49);
        deluxeBurger.addHamburgerAddition2("Lettuce", 0.79);
        System.out.println(deluxeBurger.statusOrder());
        deluxeBurger.addHamburgerAddition3("Carrot", 0.59);
        deluxeBurger.addHamburgerAddition4("Bacon", 1.49);
        System.out.println("\nGrand Total: " + deluxeBurger.itemizeHamburger());







    }
}
