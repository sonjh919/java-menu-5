package menu.domain.recommend.dto;

import menu.domain.constant.Category;

import java.util.List;

public class GetCategorysDto {
    private List<Category> recommendCategory;

    public GetCategorysDto(List<Category> recommendCategory) {
        this.recommendCategory = recommendCategory;
    }

    public List<Category> getRecommendCategory() {
        return recommendCategory;
    }
}
