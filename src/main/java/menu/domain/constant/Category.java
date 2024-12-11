package menu.domain.constant;

public enum Category {
    JAPAN("일식"),
    KOREA("한식"),
    CHINA("중식"),
    ASIA("아시안"),
    WESTERN("양식");

    private final String category;

    Category(String category) {
        this.category = category;
    }

    @Override
    public String toString() { return category; }

}
