package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Commercial extends Customer {
    private String propertyName;
    private static double commercialRate;
    private boolean multipleProperties;

    //constructor
    public Commercial(String pName, boolean multiple, String name, String phone, String address, double footage){
        super(name, phone, address, footage);
        this.propertyName = pName;
        this.commercialRate = 5.00;        //for every 1000sqft
        this.multipleProperties = false;
    }
    /**
     * calculates the total cost and displays information
     */
    public void calulate(boolean multipleProperties, String name, String phone, String address, double footage){
        double costByCommericalRate = 0.0;
        double costBySqFt = 0.0;
        double extraSqFt = 0.0;
        double extraSqFtCost = 0.0;
        double discount = 0.0;
        double totalCost = 0.0;
        System.out.println(name);

        extraSqFt = squareFootage % 1000;
        /**
         * calculates the extra footage
         */
        if(extraSqFt > 0){
            costBySqFt = commercialRate / 1000;
            extraSqFtCost = extraSqFt * costBySqFt;
        }
        costByCommericalRate = (squareFootage/1000)*commercialRate;
        totalCost = costByCommericalRate + extraSqFtCost;
        /**
         * calculates the discount into the total cost
         */
        if(!multipleProperties){
            discount = .10 * totalCost;
            totalCost = discount - totalCost;
            if(totalCost <= 0)
                totalCost = 0;
        }
        //prints out information
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Phone number: " + phone);
        System.out.println("Customer Address: " + address);
        System.out.println("Square footage: " + footage);
        System.out.println("Property Name: " + propertyName);
        if(!multipleProperties)
            System.out.println("Multiple properties discount of 10% was applied.");
        System.out.println("Total cost of the lawn service: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(totalCost) + "\n");
    }
}
