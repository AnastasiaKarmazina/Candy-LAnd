package models;

import calculateTax.Tax;

public class TaxModel  implements Tax {
    @Override
    public double calculateTax(double priceWithDiscount){
        if(priceWithDiscount <= 5000){
            return priceWithDiscount * 2 / 100;
        }else if(priceWithDiscount > 5000 && priceWithDiscount <= 10000){
            return priceWithDiscount * 5 / 100;
        }else if(priceWithDiscount > 10000){
            return priceWithDiscount * 7 / 100;
        }
        return calculateTax(priceWithDiscount);
    }
    public double calculateTaxWithCost(double priceWithDiscount, double tax){
        return priceWithDiscount + tax;
    }
}
