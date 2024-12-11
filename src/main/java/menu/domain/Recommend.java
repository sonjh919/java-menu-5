package menu.domain;

import menu.domain.constant.Category;

import java.util.List;

public class Recommend {
    CategoryNumberGenerator categoryNumberGenerator;
    List<Category> recommendCategory;

    public Recommend() {
        this.categoryNumberGenerator = CategoryNumberGenerator.create();
    }

    public void addCategorys(){
        for (int i = 0; i < 5; i++) {
            addCategory();
        }
    }

    private void addCategory() {
        while(true) {
            int categoryNumber = categoryNumberGenerator.generate();
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
}
