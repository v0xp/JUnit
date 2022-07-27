import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        while (true) {
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти, -5 чтобы поменять на новое оружие%n",
                    player.getSlotsCount()

            );
            player.print();

            int slot;
            String newWeapon;

            // главный цикл игры:
            // запрашивать номер с клавиатуры
            slot = scanner.nextInt();
            if (slot != -1 && slot != -5) {
                player.shotWithWeapon(slot);
                continue;
            } else if (slot == -5) {
                System.out.println("Загрузите оружие");
                newWeapon = scanner.next();
                player.setWeaponSlots(newWeapon);
                continue;
            }
            System.out.println("Game over!");
            break;

        }
    }
}