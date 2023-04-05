package controller;

import models.PriceModel;
import product.ProductInfo;
import utils.Rounder;
import views.ViewPrice;

public class PriceController {
    private final PriceModel model;
    private final ViewPrice view;
    private String name;
    private int amount;
    private double tariff;

    public PriceController(PriceModel model, ViewPrice view){
        this.model = model;
        this.view = view;
    }
    public void runApp(){
        mapDataToModel();
        setOutput(getRoundValues(calcPrice()));


    }
    private void mapDataToModel(){
        String[] data = view.getData();
        ProductInfo product = new ProductInfo();

        product.setName(data[0]);
        name = product.getName();

        product.setAmount(Integer.parseInt(data[1]));
        amount = product.getAmount();

        product.setTariff(Double.parseDouble(data[2]));
        tariff = product.getTariff();
    }
    private double calcPrice(){
        return model.calculatePrice(tariff, amount);
    }
    private String getRoundValues(double calcValue){
        return Rounder.roundValue(calcValue);
    }
    private void setOutput(String output) {

        view.getOutput(output);
    }

}
