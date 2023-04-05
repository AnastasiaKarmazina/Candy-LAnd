package controller;

import models.CardTaxModel;
import models.TaxModel;
import utils.Rounder;
import views.ViewTax;

public class TaxController {
    private final TaxModel taxModel;
    private final DiscountController discountController;
    private final ViewTax viewTax;

    public TaxController(TaxModel taxModel, DiscountController discountController, ViewTax viewTax){
        this.taxModel = taxModel;
        this.discountController = discountController;
        this.viewTax = viewTax;
    }
    private void runApp(){
        double[] calcValues = {
                calcTax(), calcTaxWithCost()
        };
        String[] roundValues = getRoundValues(calcValues);
        setOutput(formOutput(roundValues));

    }

    private double calcTax(){
        return taxModel.calculateTax(discountController.calcPriceWithDiscount());
    }
    private double calcTaxWithCost(){
        return taxModel.calculateTaxWithCost(discountController.calcPriceWithDiscount(), calcTax());
    }
    private String[] getRoundValues(double[] calcValues) {
        return new String[]{
                Rounder.roundValue(calcValues[0]),
                Rounder.roundValue(calcValues[1])
        };

    }
    private String formOutput(String[] calcValues) {
        return "------------------------------\n" +
                "Tax amount (USD): " + calcValues[0] + "\n" +
                "Cost amount (USD): " + calcValues[1];

    }
    private void setOutput(String output) {

        viewTax.getOutput(output);
    }
}
