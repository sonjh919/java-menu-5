package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    private String name;
    private List<String> cantEatMenus;

    public Coach(String name) {
        this.name = name;
        this.cantEatMenus = new ArrayList<>();
    }

    public void setCantEatMenus(List<String> cantEatMenus) {
        this.cantEatMenus = cantEatMenus;
        cantEatMenus.forEach(System.out::println);
    }
}
