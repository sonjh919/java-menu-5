package menu.view;

import static menu.view.Output.NEW_LINE;

public class OutputView {

    public void printMessage(final Output output) {
        System.out.println(output.message);
    }

    //test
    public void printNewLine() {
        System.out.print(NEW_LINE.message);
    }
}
