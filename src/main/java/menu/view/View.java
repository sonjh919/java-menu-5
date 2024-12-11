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

    public String inputCoaches() {
        outputView.printMessage(Output.START_MESSAGE);
        outputView.printMessage(Output.INPUT_COACHS);
        return inputView.userInput();
    }
}
