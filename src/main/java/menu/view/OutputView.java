package menu.view;

import static menu.view.Output.INPUT_CANT_EAT_MENU;
import static menu.view.Output.NEW_LINE;

public class OutputView {

    public void printMessage(final Output output) {
        System.out.println(output.message);
    }

    public void printNewLine() {
        System.out.print(NEW_LINE.message);
    }

    public void printCantEatMenu(String name) {
        System.out.printf(INPUT_CANT_EAT_MENU.message, name);
    }
}
