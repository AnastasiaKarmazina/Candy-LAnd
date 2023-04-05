package controller;

import models.CardTaxModel;
import utils.Rounder;
import views.ViewCardTax;

public class CardTaxController {
    private final CardTaxModel cardTaxModel;
    private final DiscountController discountController;
    private final ViewCardTax viewCardTax;

    public CardTaxController(CardTaxModel cardTaxModel, DiscountController discountController, ViewCardTax viewCardTax){
        this.cardTaxModel =cardTaxModel;
        this.discountController = discountController;
        this.viewCardTax = viewCardTax;
    }
    private void runApp(){
        double[] calcValues = {
                calcCardTax(), calcTaxWithCardCost()
        };
        String[] roundValues = getRoundValues(calcValues);
        setOutput(formOutput(roundValues));
    }
    private double calcCardTax(){
        return cardTaxModel.calculateCardTax(discountController.calcPriceWithDiscount());
    }
    private double calcTaxWithCardCost(){
        return cardTaxModel.calculateTaxWithCardCost(discountController.calcPriceWithDiscount(), calcCardTax());
    }
    private String[] getRoundValues(double[] calcValues) {
        return new String[]{
                Rounder.roundValue(calcValues[0]),
                Rounder.roundValue(calcValues[1]),

        };
    }
    private String formOutput(String[] calcValues) {
        return
                "------------------------------\n" +
                "Tax amount (USD): " + calcValues[0] + "\n" +
                "Cost amount (USD): " + calcValues[1];
    }
    private void setOutput(String output) {
        viewCardTax.getOutput(output);
    }


}
