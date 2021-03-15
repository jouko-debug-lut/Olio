package com.example.bottledispenser;

public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double bottle_size;
    private double bottle_price;

    public Bottle(){
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        bottle_size = 0.5;
        bottle_price = 1.80;
    }
    public Bottle(String name1, String manuf, double totE, double size, double price){
        name = name1;
        manufacturer = manuf;
        total_energy = totE;
        bottle_size = size;
        bottle_price = price;
    }

    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public double getEnergy(){
        return total_energy;
    }
    public double getSize(){
        return bottle_size;
    }
    public double getPrice(){
        return bottle_price;
    }
}
