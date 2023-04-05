package models;

import controller.*;
import views.*;

public class AppModel {
    public void runPayCash() {
        PriceModel model = new PriceModel();
        ViewPrice viewPrice = new ViewPrice();
        PriceController priceController = new PriceController(model, viewPrice);
        TaxModel taxModel = new TaxModel();
        ViewTax viewTax = new ViewTax();
        DiscountModel discountModel = new DiscountModel();
        ViewDiscount viewDiscount = new ViewDiscount();
        DiscountController discountController = new DiscountController(discountModel, viewDiscount);
        TaxController taxController = new TaxController(taxModel, discountController, viewTax);
        priceController.runApp();
        taxController.runApp();
    }

    public void runPayCard() {
        PriceModel model = new PriceModel();
        ViewPrice viewPrice = new ViewPrice();
        PriceController priceController = new PriceController(model, viewPrice);
        ViewCardTax viewCardTax = new ViewCardTax();
        CardTaxModel cardTaxModel = new CardTaxModel();
        DiscountModel discountModel = new DiscountModel();
        ViewDiscount viewDiscount = new ViewDiscount();
        DiscountController discountController = new DiscountController(discountModel, viewDiscount);
        CardTaxController cardTaxController = new CardTaxController(cardTaxModel, discountController, viewCardTax);
        priceController.runApp();
        cardTaxController.runApp();
    }
    public void runPayCheck() {

        PriceModel model = new PriceModel();
        ViewPrice viewPrice = new ViewPrice();
        PriceController priceController = new PriceController(model, viewPrice);
        ViewCheckTax viewCheckTax = new ViewCheckTax();
        CheckTaxModel checkTaxModel = new CheckTaxModel();
        DiscountModel discountModel = new DiscountModel();
        ViewDiscount viewDiscount = new ViewDiscount();
        DiscountController discountController = new DiscountController(discountModel, viewDiscount);
        CheckTaxController checkTaxController = new CheckTaxController(checkTaxModel, discountController, viewCheckTax);
        priceController.runApp();
        checkTaxController.runApp();
    }


}
