import java.util.ArrayList;
import java.util.List;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private List <Weapon> weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new ArrayList <> ();
                // заполнить слоты оружием
                weaponSlots.add(new Gun("Пистолет"));
                weaponSlots.add(new WaterPistol("Водяной пистолет"));
                weaponSlots.add(new RPG("РПГ"));
                weaponSlots.add(new AKM("АКМ"));

    }

    public void setWeaponSlots(String newWeapon) {
        weaponSlots.add(new Weapon(newWeapon));
    }

    public void print() {
        int p = 0;
        for (int i = 0; i < weaponSlots.size(); i++) {
            System.out.println( p + " " + weaponSlots.get(i).newWeapon);
            p++;
        }
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.size();
    }

    public int shotWithWeapon(int slot) {
        if (slot < 0 || slot > weaponSlots.size()-1) {
            System.out.println("Значение не корректно! Введите число в предложенном диапазоне.");
            return slot;
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots.get(slot);
        // Огонь!
        weapon.shot();
        return slot;
    }

}
