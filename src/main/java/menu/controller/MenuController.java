package menu.controller;

import menu.domain.coach.Coaches;
import menu.domain.recommend.Recommend;
import menu.view.View;

import java.util.List;

import static menu.global.exception.ExceptionHandler.getValidInput;

public class MenuController {
    private final View view;

    public MenuController(final View view) {
        this.view = view;
    }

    public void start() {
        Coaches coaches = createCoachesFromUserInput();
        createCantEatMenusByCoachFromUserInput(coaches);
        Recommend recommend = applyMenuCategorys();
        applyMenus(recommend, coaches);
        outputMenus(recommend, coaches);
    }

    private Coaches createCoachesFromUserInput() {
        return getValidInput(() -> Coaches.from(view.inputCoaches()));
    }

    private void createCantEatMenusByCoachFromUserInput(Coaches coaches) {
        List<String> coachesName = coaches.getCoachesName();
        for (int i = 0; i < coachesName.size(); i++) {
            String name = coachesName.get(i);
            int count = i;
            getValidInput(() -> coaches.setCantEatMenus(view.inputCantEatMenus(name), count));
        }
    }

    private Recommend applyMenuCategorys() {
        Recommend recommend = Recommend.create();
        recommend.addCategorys();
        return recommend;
    }

    private void applyMenus(Recommend recommend, Coaches coaches) {
        recommend.addMenus(coaches);
    }

    private void outputMenus(Recommend recommend, Coaches coaches) {
        view.outputRecommendResult(recommend.getCategorys(), coaches.getMenusByCoaches());
    }

}
