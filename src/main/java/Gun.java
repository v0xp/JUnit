public class Gun extends Weapon {

    public Gun(String newWeapon) {
        super(newWeapon);
    }

    public Gun() {
        super();
    }

    public void shot() {
        System.out.println("Пиф-паф!");
    }
}
