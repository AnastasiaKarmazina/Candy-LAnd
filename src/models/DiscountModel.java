package models;

import calculationPrice.Discount;
import calculationPrice.Price;

public class DiscountModel implements Discount, Price {
    @Override
    public double calculatePrice(double tariff, int amount){
        return tariff * amount;
    }

    @Override
    public double calculateDiscount(double price) {
        if(price <= 5000){
            return price * 5 / 100;
        }else if(price > 5000 && price <= 10000){
            return price * 10 / 100;
        }else if (price > 10000){
            return price * 15 / 100;
        }
        return calculateDiscount(price);
    }
    public double calculatePriceWithDiscount(double price, double discount){
        return price - discount;
    }
}
