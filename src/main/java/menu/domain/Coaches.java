package menu.domain;

import menu.global.exception.ExceptionMessage;
import menu.global.exception.ValidatorBuilder;

import java.util.ArrayList;
import java.util.List;

public class Coaches {
    private static final String DELIMITER = ",";
    private static final int MIN_COACH_SIZE = 2;
    private static final int MAX_COACH_SIZE = 5;
    private static final int MIN_COACH_NAME_SIZE = 2;
    private static final int MAX_COACH_NAME_SIZE = 4;

    private List<Coach> coaches = new ArrayList<>();

    public Coaches(String input) {
        List<String> coaches = List.of(input.split(DELIMITER));
        validateCoaches(coaches);
        for (String coach : coaches) {
            this.coaches.add(new Coach(coach));
        }
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
