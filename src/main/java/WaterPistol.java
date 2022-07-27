public class WaterPistol extends Weapon {

    public WaterPistol(String newWeapon) {
        super(newWeapon);
    }

    public WaterPistol() {
        super();
    }

    public void shot() {
        System.out.println("Фить-фить");
    }
}
