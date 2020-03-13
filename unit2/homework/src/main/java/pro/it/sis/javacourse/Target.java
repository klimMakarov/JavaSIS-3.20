package pro.it.sis.javacourse;

public class Target {

    private String mobType;
    private int hitPoints;

    public int getHitPoints(){
        return hitPoints;
    }

    public String getMobType(){
        return mobType;
    }

    public Target(String mobType, int hp){
        this.mobType = mobType;
        this.hitPoints = hp;
    }

    public void takeHit(Weapon weapon){
        int hp = getHitPoints();
        hp -= weapon.getDamage() + weapon.getSpecialDamage();
        if(hp <= 0) {
            System.out.printf("%s is dead!\n", getMobType());
        }
        else {
            System.out.printf("%s has %d hp left!\n", getMobType(), hp);
        }
        System.out.println("---------------------------");
    }
}

class MagicTarget extends Target{

    private String specialEffect;

    public MagicTarget(String name, int hp, String specialEffect){
        super(name, hp);
        this.specialEffect = specialEffect;
    }

    public String getSpecialEffect(){
        return specialEffect;
    }

    @Override
    public void takeHit(Weapon weapon) {
        int hp = getHitPoints();
        hp -= weapon.getDamage();
        
        if(specialEffect != weapon.getSpecialEffect()){
            System.out.printf("%s deals additional %s damage!\n", weapon.getName(), weapon.getSpecialEffect());
            hp -= weapon.getSpecialDamage();
        }
        else {
            System.out.printf("%s has immunity to %s!\n", getMobType(), getSpecialEffect());
        }
        if(hp <= 0) {
            System.out.printf("%s is dead!\n", getMobType());
        }
        else {
            System.out.printf("%s has %d hp left!\n", getMobType(), hp);
        }
        System.out.println("---------------------------");
    }
}
