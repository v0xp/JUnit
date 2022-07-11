import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ShooterTest {

    @AfterAll
    public static void finishedAll() {
        System.out.println("Все тесты закончены!");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    public void testParam(int slot) {
        Player player = new Player();
        // given:

        int expectedResult = (3 >= slot && slot >= 0) ?
                // when:
                player.shotWithWeapon(slot) : -2;

        // then:
        Assertions.assertEquals(expectedResult, slot);

    }

    @Test
    public void testConcat_validArgument_success() {
        Player player = new Player();
        // given:
        int slot = -1;
        int expectedResult = -1;

        // when:
        player.shotWithWeapon(slot);

        // then:
        Assertions.assertEquals(expectedResult, slot);
    }
    @Test
    public void testWeaponSlots() {
        Player player = new Player();
        // given:
        int slot = 4;
        int expectedResult = 4;

        // when:
        player.getSlotsCount();

        // then:
        Assertions.assertEquals(expectedResult, slot);
        System.out.println("Тест testWeaponSlots закончен");
    }

}
