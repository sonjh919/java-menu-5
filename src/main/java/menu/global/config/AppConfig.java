package menu.global.config;

import menu.controller.MenuController;
import menu.view.InputView;
import menu.view.OutputView;
import menu.view.View;

public enum AppConfig {
    INSTANCE;

    public MenuController createController() {
        return new MenuController(createView());
    }

    public View createView() {
        return new View(createInputView(), createOutputView());
    }

    private InputView createInputView() {
        return new InputView();
    }

    private OutputView createOutputView() {
        return new OutputView();
    }
}
