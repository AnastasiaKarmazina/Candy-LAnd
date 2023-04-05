package models;

import calculateTax.CardTax;

public class CardTaxModel  implements CardTax {

    @Override
    public double calculateCardTax(double priceWithDiscount){
        if(priceWithDiscount <= 5000){
            return priceWithDiscount * 3 / 100;
        }else if(priceWithDiscount > 5000 && priceWithDiscount <= 10000){
            return priceWithDiscount * 2 / 100;
        }else if(priceWithDiscount > 10000){
            return priceWithDiscount;
        }
        return calculateCardTax(priceWithDiscount);
    }
    public double calculateTaxWithCardCost(double priceWithDiscount, double cardTax){
        return priceWithDiscount + cardTax;
    }
}
