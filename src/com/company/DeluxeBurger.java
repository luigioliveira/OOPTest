package com.company;

public class DeluxeBurger extends Hamburger {

      public DeluxeBurger() {
        super("Deluxe Burger", "Sausage and bacon", 14.95, "Butter Premium");
        super.addHamburgerAddition1("Chips", 1.98);
        super.addHamburgerAddition2("Coke", 3.95);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
}

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe burger cannot have another extra(s).");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe burger cannot have another extra(s).");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe burger cannot have another extra(s).");
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe burger cannot have another extra(s).");
    }
}
