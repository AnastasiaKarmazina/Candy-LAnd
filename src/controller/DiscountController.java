package controller;

import models.DiscountModel;
import product.ProductInfo;
import utils.Rounder;
import views.ViewDiscount;

public class DiscountController {
    private final DiscountModel model;
    private final ViewDiscount view;
    private String name;
    private int amount;
    private double tariff;

    public DiscountController(DiscountModel model, ViewDiscount view){
        this.model = model;
        this.view = view;
    }
    public void runApp(){
        mapDataToModel();
        double[] calcValues = {
                calcInicialPrice(), calcDiscount(),calcPriceWithDiscount()
        };
        String[] roundValues = getRoundValues(calcValues);
        setOutput(formOutput(roundValues));

    }
    private void  mapDataToModel(){
        String[] data = view.getData();
        ProductInfo product = new ProductInfo();

        product.setName(data[0]);
        name = product.getName();

        product.setAmount(Integer.parseInt(data[1]));
        amount = product.getAmount();

        product.setTariff(Double.parseDouble(data[2]));
        tariff = product.getTariff();
    }
    private double calcInicialPrice(){
        return model.calculatePrice(tariff,amount);
    }
    private double calcDiscount(){
        return model.calculateDiscount(calcInicialPrice());
    }
    public double calcPriceWithDiscount(){
        return model.calculatePriceWithDiscount(calcInicialPrice(), calcDiscount());
    }

    private String[] getRoundValues(double[] calcValues) {
        return new String[] {
                Rounder.roundValue(calcValues[0]),
                Rounder.roundValue(calcValues[1]),
                Rounder.roundValue(calcValues[2]),
                Rounder.roundValue(calcValues[3]),
        };
        }
    private  String formOutput(String[] calcValues){
        return
                "Product name: " + name + "; " + "\nAmount product: " + amount + "ШТ;" +
                        "\nTariff: " + tariff + " USD;" + "\nPrice is: " + calcValues[0] + " USD;" +
                        "\nDiscount is: " + calcValues[1] + " USD;" + "\nPrice with discount is: " +
                        calcValues[2] + " USD.";


    }
    private void setOutput(String output){
        view.getOutput(output);
    }


}
