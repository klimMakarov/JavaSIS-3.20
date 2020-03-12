package pro.it.sis.javacourse;

public class Battle {
    public static void main(String[] args){
        Weapon iceSword = new Weapon("Saha's Night", 150, "Ice", 50);
        Weapon fireSword = new Weapon("Blazing Asphalt", 280, "Fire", 50);

        MagicTarget iceGiant = new MagicTarget("Ice giant", 300, "Ice");
        MagicTarget efreet = new MagicTarget("Efreet", 290, "Fire");

        iceSword.hit(iceGiant);
        iceSword.hit(efreet);

        fireSword.hit(iceGiant);
        fireSword.hit(efreet);
    }
}
