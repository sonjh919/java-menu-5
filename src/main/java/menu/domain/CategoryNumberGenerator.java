package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.global.util.NumberGenerator;

public class CategoryNumberGenerator implements NumberGenerator {
    private static final int CATEGORY_NUMBER_MIN = 1;
    private static final int CATEGORY_NUMBER_MAX = 45;

    private CategoryNumberGenerator() {
    }

    public static CategoryNumberGenerator create() {
        return new CategoryNumberGenerator();
    }

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(CATEGORY_NUMBER_MIN, CATEGORY_NUMBER_MAX);
    }

}
