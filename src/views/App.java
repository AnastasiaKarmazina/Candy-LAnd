package views;

import controller.AppController;
import models.AppModel;

public class App {
    public static void main(String[] args) {
        AppModel model = new AppModel();
        AppView view = new AppView();
        AppController controller = new AppController(model, view);
        controller.runApp();
    }
}
