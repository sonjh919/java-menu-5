package menu.domain.coach.dto;

import java.util.List;

public class GetMenusByCoaches {
    private List<GetMenusByCoach> getMenusByCoaches;

    public GetMenusByCoaches(List<GetMenusByCoach> getMenusByCoaches) {
        this.getMenusByCoaches = getMenusByCoaches;
    }

    public List<GetMenusByCoach> getGetMenusByCoaches() {
        return getMenusByCoaches;
    }
}
