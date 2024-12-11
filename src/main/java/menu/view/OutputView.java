package menu.view;

import menu.domain.coach.dto.GetMenusByCoach;
import menu.domain.coach.dto.GetMenusByCoaches;
import menu.domain.recommend.dto.GetCategorysDto;

import static menu.view.Output.*;

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

    public void printRecommendResult(GetCategorysDto categorys, GetMenusByCoaches menusByCoaches) {
        System.out.println(MENU_RESULT.message);
        System.out.println(DAY_RESULT.message);
        printCategorys(categorys);
        printMenusByCoaches(menusByCoaches);
        printNewLine();
        System.out.println(END_MESSAGE.message);
    }

    private void printCategorys(GetCategorysDto categorys) {
        System.out.printf(CATEGORY_RESULT.message,
                categorys.getRecommendCategory().get(0),
                categorys.getRecommendCategory().get(1),
                categorys.getRecommendCategory().get(2),
                categorys.getRecommendCategory().get(3),
                categorys.getRecommendCategory().get(4)
        );
        printNewLine();
    }

    private void printMenusByCoaches(GetMenusByCoaches menusByCoaches) {
        for (GetMenusByCoach getMenusByCoach : menusByCoaches.getGetMenusByCoaches()) {
            System.out.printf(COACH_MENU_RESULT.message,
                    getMenusByCoach.getName(),
                    getMenusByCoach.getRecommendMenus().get(0),
                    getMenusByCoach.getRecommendMenus().get(1),
                    getMenusByCoach.getRecommendMenus().get(2),
                    getMenusByCoach.getRecommendMenus().get(3),
                    getMenusByCoach.getRecommendMenus().get(4)
                    );
            printNewLine();
        }
    }
}
