public class Weapon {
    private WeaponType weapon;
    private String WeaponType;

    public Weapon(WeaponType weapon, String weaponType) {
        this.weapon = weapon;
        this.WeaponType = weaponType;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public String getWeaponType() {
        return WeaponType;
    }

    public void setWeaponType(String weaponType) {
        WeaponType = weaponType;
    }
}
