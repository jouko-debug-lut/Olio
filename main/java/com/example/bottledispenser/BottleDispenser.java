package com.example.bottledispenser;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class BottleDispenser {
    private int bottles;
    private double money;
    private ArrayList<Bottle> bottle_array;
    Bottle newBottle = new Bottle();

    public BottleDispenser() {
        bottles = 5;
        money = 0;
        bottle_array = new ArrayList<Bottle>();

        bottle_array.add(new Bottle(newBottle.getName(), newBottle.getManufacturer(), newBottle.getEnergy(), newBottle.getSize(), newBottle.getPrice()));
        bottle_array.add(new Bottle(newBottle.getName(), newBottle.getManufacturer(), newBottle.getEnergy(), newBottle.getSize(), newBottle.getPrice()));
        bottle_array.add(new Bottle("Coca-cola Zero", "Coca-cola", newBottle.getEnergy(), 0.5 , 2.0));
        bottle_array.add(new Bottle("Coca-cola Zero", "Coca-cola", newBottle.getEnergy(), 1.5, 2.5));
        bottle_array.add(new Bottle("Fanta Zero", "Fanta", newBottle.getEnergy(), 0.5, 1.95));


    }
    public void addMoney(TextView textView, int getMoney) {
        //money += 1;
        money = money + getMoney;
        textView.setText("Klink! Added more money! You have " + money + "€ money.");
        //System.out.println("Klink! Added more money!");
    }
    public void buyBottle(TextView textView) {
        if (money >= 1.8) {
            bottles -= 1;
            if (bottles > 0) {
                textView.setText("Kachunk! Bottle came out of dispenser.");
                money -= 1.8;
            } else if (bottles == 0) {
                textView.setText("No more bottles left!");
            }
        }
        else if (money < 1.8) {
            textView.setText("Insert more money!");
            }
    }
    public void returnMoney(TextView textView) {
        if (money != 0) {
            String raha = String.format("%.2f", money);
            textView.setText("You got " + raha + "€ back!");
            money = 0;
        }
        else if(money == 0) {
            textView.setText("All money gone!");
        }
    }
}

