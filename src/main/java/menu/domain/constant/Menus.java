package menu.domain.constant;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static menu.global.exception.ExceptionMessage.MENU_NOT_FOUND;

public enum Menus {
    INSTANCE;

    private Map<Category, List<String>> menus;
    final List<String> japan = List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼");
    final List<String> korea = List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음");
    final List<String> china = List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채");
    final List<String> asia = List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜");
    final List<String> western = List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니");

    Menus() {
        this.menus = new EnumMap<>(Category.class);
        this.menus.put(Category.JAPAN, japan);
        this.menus.put(Category.KOREA, korea);
        this.menus.put(Category.CHINA, china);
        this.menus.put(Category.ASIA, asia);
        this.menus.put(Category.WESTERN, western);
    }

    public boolean isNotExist(String input) {
        List<String> allMenus = Stream.of(korea, japan, china, asia, western)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        for (String menu : allMenus) {
            if (Objects.equals(menu, input)) {
                return false;
            }
        }
        return true;
    }

    public List<String> getMenusByCategory(Category input) {
        for (Category category : menus.keySet()) {
            return menus.get(input);
        }
        throw new IllegalArgumentException(MENU_NOT_FOUND.message);
    }
}
