package menu.domain;

import menu.domain.constant.Category;
import menu.domain.constant.Menus;
import menu.global.exception.ExceptionMessage;
import menu.global.exception.ValidatorBuilder;

import java.util.ArrayList;
import java.util.List;

import static menu.global.exception.ExceptionMessage.MAX_MENU;
import static menu.global.exception.ExceptionMessage.MENU_NOT_FOUND;

public class Coaches {
    private static final String DELIMITER = ",";
    private static final String MENU_DELIMITER = ", ";
    private static final int MIN_COACH_SIZE = 2;
    private static final int MAX_COACH_SIZE = 5;
    private static final int MIN_COACH_NAME_SIZE = 2;
    private static final int MAX_COACH_NAME_SIZE = 4;
    private static final int MAX_CANT_EAT_MENU_SIZE = 3;

    private List<Coach> coaches = new ArrayList<>();
    private List<String> coachesName;

    public Coaches(String input) {
        coachesName = List.of(input.split(DELIMITER));
        validateCoaches(coachesName);
        for (String coach : coachesName) {
            this.coaches.add(new Coach(coach));
        }
    }

    public List<String> getCoachesName(){
        return coachesName;
    }

    public int setCantEatMenus(String input, int count) {
        List<String> cantEatMenus = List.of(input.split(MENU_DELIMITER));
        if(!validateIsEmpty(input)){
            validateCantEatMenus(cantEatMenus);
            coaches.get(count).setCantEatMenus(cantEatMenus);
        };
        return count;
    }

    public void addMenus(Category category, RecommendNumberGenerator recommendNumberGenerator) {
        for (Coach coach : coaches) {
            coach.addMenus(category, recommendNumberGenerator);
        }
    }

    private boolean validateIsEmpty(String input) {
        return !input.isEmpty() && input.trim().isEmpty();
    }

    private void validateCantEatMenus(List<String> input) {
        ValidatorBuilder.from(input)
                    .validate(cantEatMenus -> cantEatMenus.size() > MAX_CANT_EAT_MENU_SIZE, MAX_MENU)
                    .validate(cantEatMenus -> cantEatMenus.size() != cantEatMenus.stream().distinct().count(), ExceptionMessage.MENU_DUPLICATE)
                    .validate(cantEatMenus -> cantEatMenus.stream()
                            .anyMatch(Menus.INSTANCE::isNotExist), MENU_NOT_FOUND)
                    .get();

    }

    private void validateCoaches(List<String> input) {
        ValidatorBuilder.from(input)
                .validate(coaches -> coaches.size() < MIN_COACH_SIZE, ExceptionMessage.COACH_MIN_COUNT)
                .validate(coaches -> coaches.size() > MAX_COACH_SIZE, ExceptionMessage.COACH_MAX_COUNT)
                .validate(coaches -> coaches.stream()
                        .anyMatch(coach -> coach.length() < MIN_COACH_NAME_SIZE || coach.length() > MAX_COACH_NAME_SIZE),
                        ExceptionMessage.COACH_NAME_SIZE)
                .validate(coaches -> coaches.size() != coaches.stream().distinct().count(), ExceptionMessage.COACH_DUPLICATE)
                .get();
    }


}
