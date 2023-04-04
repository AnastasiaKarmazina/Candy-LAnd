package models;

import calculateTax.CheckTax;

public class CheckTaxModel extends DiscountModel implements CheckTax {

    public CheckTaxModel(double calculatePrice, double calculateDiscount, double calculatePriceWithDiscount){
        super();
    }
    @Override
    public double calculateCheckTax(double priceWithDiscount){
        return priceWithDiscount * 2 / 100;
    }
    public double calculateTaxCheckCost(double priceWithDiscount, double checkTax){
        return priceWithDiscount + checkTax;
    }
}
