package menu.controller;

import menu.domain.Coaches;
import menu.view.View;

import static menu.global.exception.ExceptionHandler.getValidInput;

public class MenuController {
    private final View view;

    public MenuController(final View view) {
        this.view = view;
    }

    public void start() {
        // 플로우. 리드미의 구현 기능 목록 따라가기
        //입력
        createCoachesFromUserInput();
//        createCantEatMenusByCoachFromUserInput();
//        applyMenuCategorys();
//        applyMenus();
//        outputMenus();
    }

    private void createCoachesFromUserInput() {
        getValidInput(() -> new Coaches(view.inputCoaches()));
    }

}
