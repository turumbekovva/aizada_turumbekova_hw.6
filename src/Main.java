public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(350);
        boss.setDamage(20);
        boss.setWeapon(WeaponType.FIREARMS);

        System.out.println("ЗДОРОВЬЕ : " + boss.getHealth() + "   " + "УРОН : " + boss.getDamage() + "   " + "ОРУЖИЕ : " + boss.getWeapon());
    }
}