package com.company;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1 (String addition1Name, double addition1Price) {
            this.addition1Name = addition1Name;
            this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2 (String addition2Name, double addition2Price) {
            this.addition2Name = addition2Name;
            this.addition2Price = addition2Price;
        }

    public void addHamburgerAddition3 (String addition3Name, double addition3Price) {
            this.addition3Name = addition3Name;
            this.addition3Price = addition3Price;
        }

    public void addHamburgerAddition4 (String addition4Name, double addition4Price) {
            this.addition4Name = addition4Name;
            this.addition4Price = addition4Price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll price is " + this.price);
            if(this.addition1Name != null) {
                hamburgerPrice += this.addition1Price;
                System.out.println("Extra 1 added : " + this.addition1Name + "| Cost: " + this.addition1Price);
            }

            if(this.addition2Name != null) {
                hamburgerPrice += this.addition2Price;
                System.out.println("Extra 2 added : " + this.addition2Name + "| Cost: " + this.addition2Price);
            }

            if(this.addition3Name != null) {
                hamburgerPrice += this.addition3Price;
                System.out.println("Extra 3 added : " + this.addition3Name + "| Cost: " + this.addition3Price);
            }

            if(this.addition4Name != null) {
                hamburgerPrice += this.addition4Price;
                System.out.println("Extra 4 added : " + this.addition4Name + "| Cost: " + this.addition4Price);
            }

            return hamburgerPrice;
    }

    public String statusOrder() {
        String info = "Base hamburger price : " + this.price + " | Additionals:\n";

        if(addition1Name != null) {
            info += "+" + addition1Name + " => " + addition1Price + ".\n";
        }
        if(addition2Name != null) {
            info += "+" + addition2Name + " => " + addition2Price + ".\n";
        }
        if(addition3Name != null) {
            info += "+" + addition3Name + " => " + addition3Price + ".\n";
        }
        if(addition4Name != null) {
            info += "+" + addition4Name + " => " + addition4Price + ".\n";
        }

        return info;

    }

}
