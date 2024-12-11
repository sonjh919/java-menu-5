package menu.domain;

import menu.domain.constant.Category;
import menu.domain.constant.Menus;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    private String name;
    private List<String> cantEatMenus;
    private List<String> recommendMenus;

    public Coach(String name) {
        this.name = name;
        this.cantEatMenus = new ArrayList<>();
        this.recommendMenus = new ArrayList<>();
    }

    public void setCantEatMenus(List<String> cantEatMenus) {
        this.cantEatMenus = cantEatMenus;
    }

    public void addMenus(Category category, RecommendNumberGenerator recommendNumberGenerator) {
        while(true) {
            List<String> menus = Menus.INSTANCE.getMenusByCategory(category);
            String menu = recommendNumberGenerator.shuffile(menus).get(0);
            if(validateNotContainsMenu(menu)){
                recommendMenus.add(menu);
                return;
            };
        }
    }

    private boolean validateNotContainsMenu(String menu) {
        return !recommendMenus.contains(menu);
    }
}
