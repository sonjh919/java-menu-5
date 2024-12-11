package menu.domain.coach.dto;

import java.util.List;

public class GetMenusByCoach {
    private String name;
    private List<String> recommendMenus;

    public GetMenusByCoach(String name, List<String> recommendMenus) {
        this.name = name;
        this.recommendMenus = recommendMenus;
    }

    public String getName() {
        return name;
    }

    public List<String> getRecommendMenus() {
        return recommendMenus;
    }
}
