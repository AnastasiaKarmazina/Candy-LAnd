package models;

import calculateTax.CardTax;

public class CardTaxModel extends DiscountModel implements CardTax {

    public CardTaxModel(double calculatePrice, double calculateDiscount, double calculatePriceWithDiscount){
        super();
    }
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
