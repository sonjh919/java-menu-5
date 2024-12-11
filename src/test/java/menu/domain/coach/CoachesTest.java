package menu.domain.coach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CoachesTest {
    @ParameterizedTest
    @ValueSource(strings = {"우택호","우,택,호","우택,우택호,우택호1,우택호2,우택호3,우택호4"})
    void 코치_입력_실패_테스트(String coaches) {
        assertThatThrownBy(() -> Coaches.from(coaches))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"우택호","가,나,다,라,마"})
    void 메뉴_입력_실패_테스트(String menus) {
        Coaches coaches = Coaches.from("토미,제임스,포코");

        assertThatThrownBy(() -> coaches.setCantEatMenus(menus,1))
                .isInstanceOf(IllegalArgumentException.class);
    }

    //성공 테스트?
}
