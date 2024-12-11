package menu.view;

public class View {
    private final InputView inputView;
    private final OutputView outputView;

    public View(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    //test
    public String inputText() {
        outputView.printMessage(Output.NEW_LINE);
        return inputView.userInput();
    }

    //test, 매개변수 dto
    public void outputText() {
        outputView.printNewLine();
        outputView.printMessage(Output.NEW_LINE);
    }
}