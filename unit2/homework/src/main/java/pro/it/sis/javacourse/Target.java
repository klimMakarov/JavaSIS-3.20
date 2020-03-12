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
}
