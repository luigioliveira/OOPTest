package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "BROWN RYE BREAD ROLL");
    }

    public void addHealthyExtra1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyExtra2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Extra 5 added : " + this.healthyExtra1Name + "| Cost: " + this.healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Extra 6 added : " + this.healthyExtra2Name + "| Cost: " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }


//    @Override
//    public String getAdditionalNames() {
//        String additionals = super.getAdditionalNames();
//
//        if(healthyExtra1Name != null) {
//            additionals += healthyExtra1Name + ",";
//        }
//
//        if(healthyExtra2Name != null) {
//            additionals += healthyExtra2Name + ".";
//        }
//
//        return additionals;
//    }
}

