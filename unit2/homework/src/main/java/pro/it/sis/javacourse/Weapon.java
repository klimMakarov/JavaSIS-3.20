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

    public void hit(Target target) {
        int hp = target.getHitPoints();
        hp -= damage;
    }
    public void hit(MagicTarget target) {
        System.out.printf("You hitting %s with %s\n", target.getMobType(), name);
        int hp = target.getHitPoints();
        hp -= damage;
        if(specialEffect != target.getSpecialEffect()){
            hp -= specialDamage;
        }
        else {
            System.out.printf("%s has immunity to %s!\n", target.getMobType(), target.getSpecialEffect());
        }

        if(hp <= 0) System.out.printf("%s is dead!\n", target.getMobType());
        else System.out.printf("%s has %d hp left!\n", target.getMobType(), hp);

        System.out.println("---------------------------");
    }
}
