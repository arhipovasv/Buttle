public class Arena {
    public static void main(String[] args) {
        Archer shooterElf = new Archer("Леголас", new DistantButtleElf());
        Swordsman swordsmanOrk = new Swordsman("Арагорн", new CloseBattleHuman());
        Battle battle = new Battle(shooterElf, swordsmanOrk);
        battle.start();
    }
}
