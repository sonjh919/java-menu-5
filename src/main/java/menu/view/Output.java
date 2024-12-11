package menu.view;

public enum Output {
    START_MESSAGE("점심 메뉴 추천을 시작합니다."),
    INPUT_COACHS("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_CANT_EAT_MENU("%s(이)가 못 먹는 메뉴를 입력해 주세요."),

    MENU_RESULT("메뉴 추천 결과입니다."),
    DAY_RESULT("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"),
    CATEGORY_RESULT("[ 카테고리 | %s | %s | %s | %s | %s ]"),
    COACH_MENU_RESULT("[ %s | %s | %s | %s | %s | %s ]"),

    END_MESSAGE("추천을 완료했습니다."),

    NEW_LINE(System.lineSeparator());

    final String message;

    Output(final String message) {
        this.message = message;
    }
}
