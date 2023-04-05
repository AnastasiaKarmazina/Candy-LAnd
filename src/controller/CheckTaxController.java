package controller;


import models.CheckTaxModel;
import utils.Rounder;
import views.ViewCheckTax;

public class CheckTaxController {
    private final CheckTaxModel checkTaxModel;
    private final DiscountController discountController;
    private final ViewCheckTax viewCheckTax;

    public CheckTaxController(CheckTaxModel cardTaxModel, DiscountController discountController, ViewCheckTax viewCheckTax){
        this.checkTaxModel = cardTaxModel;
        this.discountController = discountController;
        this.viewCheckTax = viewCheckTax;
    }
    private void runApp(){
        double[] calcValues = {
                calcCheckTax(), calcCostWithCheckTax()
        };
        String[] roundValues = getRoundValues(calcValues);
        setOutput(formOutput(roundValues));
    }
    private double calcCheckTax(){
        return checkTaxModel.calculateCheckTax(discountController.calcPriceWithDiscount());
    }
    private double calcCostWithCheckTax(){
        return checkTaxModel.calculateTaxCheckCost(discountController.calcPriceWithDiscount(),calcCheckTax());
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

        viewCheckTax.getOutput(output);
    }


}
