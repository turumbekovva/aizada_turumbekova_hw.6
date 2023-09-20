public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setWeapon(WeaponType.FIREARMS);
        weapon.setWeaponName("Дробовик");

        Boss boss = new Boss();
        boss.setHealth(350);
        boss.setDamage(25);


        System.out.println("ЗДОРОВЬЕ : " + boss.getHealth() + "   " + "УРОН : " + boss.getDamage()  +
                "   " + "ТИП ОРУЖИЕ : " + weapon.getWeapon() + "   " + "НАЗВАНИЕ ОРУЖИЕ : " + weapon.getWeaponName());
    }
}