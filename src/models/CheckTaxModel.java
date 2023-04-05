package models;

import calculateTax.CheckTax;

public class CheckTaxModel  implements CheckTax {

    @Override
    public double calculateCheckTax(double priceWithDiscount){
        return priceWithDiscount * 2 / 100;
    }
    public double calculateTaxCheckCost(double priceWithDiscount, double checkTax){
        return priceWithDiscount + checkTax;
    }
}
