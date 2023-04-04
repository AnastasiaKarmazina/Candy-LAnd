package models;

import calculationPrice.Price;

public class PriceModel implements Price {
    @Override
    public double calculatePrice(double tariff, int amount){
        return tariff * amount;
    }



}
