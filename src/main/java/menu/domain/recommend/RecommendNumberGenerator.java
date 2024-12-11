package menu.domain.recommend;

import camp.nextstep.edu.missionutils.Randoms;
import menu.global.util.NumberGenerator;

import java.util.List;

public class RecommendNumberGenerator implements NumberGenerator {
    private static final int CATEGORY_NUMBER_MIN = 1;
    private static final int CATEGORY_NUMBER_MAX = 5;

    private RecommendNumberGenerator() {
    }

    public static RecommendNumberGenerator create() {
        return new RecommendNumberGenerator();
    }

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(CATEGORY_NUMBER_MIN, CATEGORY_NUMBER_MAX);
    }

    @Override
    public List<String> shuffile(List<String> menus) {
        return Randoms.shuffle(menus);
    }

}
