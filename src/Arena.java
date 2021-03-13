public class Arena {

    public static void main(String[] args) {
        Archer shooterElf = new Archer("Леголас");
        Swordsman swordsmanOrk = new Swordsman("Арагорн");
        Battle battle = new Battle(swordsmanOrk, shooterElf);
        battle.start();
    }
}
