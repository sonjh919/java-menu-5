package menu.view;

import menu.domain.coach.dto.GetMenusByCoaches;
import menu.domain.recommend.dto.GetCategorysDto;

public class View {
    private final InputView inputView;
    private final OutputView outputView;

    public View(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public String inputCoaches() {
        outputView.printMessage(Output.START_MESSAGE);
        outputView.printMessage(Output.INPUT_COACHS);
        return inputView.userInput();
    }

    public String inputCantEatMenus(String name) {
        outputView.printCantEatMenu(name);
        return inputView.userInput();
    }

    public void outputRecommendResult(GetCategorysDto categorys, GetMenusByCoaches menusByCoaches) {
        outputView.printRecommendResult(categorys,menusByCoaches);
    }
}
