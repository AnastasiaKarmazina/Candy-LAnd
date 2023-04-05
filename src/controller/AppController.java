package controller;

import models.AppModel;
import utils.Constants;
import views.AppView;

public class AppController {
    AppModel model;
    AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        filterChoice(view.chooseOption());
    }

    private void filterChoice(int choice) {
        switch (choice) {
            case 1 -> model.runPayCash();
            case 2 -> model.runPayCard();
            case 3 -> model.runPayCheck();
            case 0 -> {
                String output = Constants.JOB_QUIT_MSG;
                view.getOutput(output, choice);
            }
        }
    }
}
