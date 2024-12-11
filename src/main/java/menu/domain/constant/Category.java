package menu.domain.constant;

import java.util.Arrays;

public enum Category {
    JAPAN("일식",1),
    KOREA("한식",2),
    CHINA("중식",3),
    ASIA("아시안",4),
    WESTERN("양식",5);

    private final String category;
    private final int categoryNumber;

    Category(String category, int categoryNumber) {
        this.category = category;
        this.categoryNumber = categoryNumber;
    }

    public static Category getCategoryByNumber(int categoryNumber) {
        return Arrays.stream(values())
                .filter(category -> category.categoryNumber==categoryNumber)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public String toString() { return category; }

}
