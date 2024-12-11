package menu.domain.recommend;

import menu.domain.coach.Coaches;
import menu.domain.constant.Category;
import menu.domain.recommend.dto.GetCategorysDto;

import java.util.ArrayList;
import java.util.List;

public class Recommend {
    RecommendNumberGenerator recommendNumberGenerator;
    List<Category> recommendCategory;

    public Recommend() {
        this.recommendNumberGenerator = RecommendNumberGenerator.create();
        this.recommendCategory = new ArrayList<>();
    }

    public void addCategorys(){
        for (int day = 0; day < 5; day++) {
            addCategory();
        }
    }

    public void addMenus(Coaches coaches) {
        for (int day = 0; day <5 ; day++) {
            coaches.addMenus(recommendCategory.get(day), recommendNumberGenerator);
        }

    }

    private void addCategory() {
        while(true) {
            int categoryNumber = recommendNumberGenerator.generate();
            Category category = Category.getCategoryByNumber(categoryNumber);
            if(validateIsNotDuplicateCategory(category)){
                recommendCategory.add(category);
                return;
            };
        }
    }

    private boolean validateIsNotDuplicateCategory(Category input) {
        int count =0;
        for (Category category : recommendCategory) {
            if(category==input)count++;
        }
        return count <= 1;
    }


    public GetCategorysDto getCategorys() {
        return new GetCategorysDto(recommendCategory);
    }
}
