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
                player.shotWithWeapon(slot) : null;

        // then:
        Assertions.assertEquals(expectedResult, slot);

    }

    @ParameterizedTest
    @ValueSource(ints = {6})
    public void testShotWithWeapon(int slot) {
        Player player = new Player();

        int expectedResult = 6;

        Assertions.assertEquals(expectedResult, player.shotWithWeapon(slot));
        System.out.println("Тест testShotWithWeapon закончен");
    }

    @Test
    public void testGetSlotsCount() {
        Player player = new Player();

        int expectedResult = 4;

        Assertions.assertEquals(expectedResult, player.getSlotsCount());
        System.out.println("Тест testGetSlotsCount закончен");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Танк"})
    public void testSetWeaponSlots(String newWeapon) {
        Player player = new Player();
        int expectedResult = 5;
        player.setWeaponSlots(newWeapon);
        Assertions.assertEquals(expectedResult, player.getSlotsCount());
        System.out.println("Тест testSetWeaponSlots закончен");
    }

}
