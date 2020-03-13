package pro.it.sis.javacourse;

public class Weapon {
    private String name;
    private int damage;
    private String specialEffect;
    private int specialDamage;

    public Weapon(String name, int damage, String specialEffect, int specialDamage){
        this.name = name;
        this.damage = damage;
        this.specialEffect = specialEffect;
        this.specialDamage = specialDamage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getSpecialEffect() {
        return specialEffect;
    }

    public int getSpecialDamage() {
        return specialDamage;
    }

    public void hit (Target target){
        target.takeHit(this);
    }
    public void hit (MagicTarget target){
        target.takeHit(this);
    }

}
