package menu;

import menu.controller.MenuController;
import menu.global.config.AppConfig;

public class Application {
    public static void main(String[] args) {
        MenuController menucontroller = AppConfig.INSTANCE.createController();
        menucontroller.start();
    }
}
