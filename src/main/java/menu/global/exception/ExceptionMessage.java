package menu.global.exception;

public enum ExceptionMessage {
    COACH_MIN_COUNT("코치는 최소 2명 이상 입력해야 합니다."),
    COACH_MAX_COUNT("코치는 최대 5명까지 입력해야 합니다."),
    COACH_NAME_SIZE("코치는 2글자 이상 4글자 이하로 입력해야 합니다."),
    COACH_DUPLICATE("코치 이름은 중복될 수 없습니다."),
    MAX_MENU("코치가 먹지 못하는 메뉴는 최대 2개입니다."),
    MENU_NOT_FOUND("없는 메뉴입니다. 다시 입력해 주세요."),

    NOT_INTEGER("정수만 입력 가능합니다.");

    private static final String PREFIX = "[ERROR] ";

    public final String message;

    ExceptionMessage(final String message) {
        this.message = PREFIX + message;
    }
}
