public class Battle {
    private final Swordsman swordsman;
    private final Archer archer;
    private int countBattle = 1;

    public Battle(Swordsman swordsman, Archer archer) {
        this.swordsman = swordsman;
        this.archer = archer;
    }

    public void start() {
        boolean alive = true;
        System.out.println("Бой между " + swordsman.getName() + " и " + archer.getName());
        while (alive) {
            if (countBattle % 2 == 1) {
                this.swordsman.run();
                if (!this.archer.slope()) {
                    int damage = swordsman.shootAttack();
                    int oldHealth = this.archer.getHealth();
                    this.archer.setHealth(oldHealth - damage);
                    System.out.println(this.archer.getName() + " Получает мощный урон от противника");
                    alive = archer.dead();
                    if (!alive) {
                        System.out.println(archer.getName() + " героически погибает");
                    }
                } else {
                    System.out.println(this.archer.getName() + " отбивает атаку");
                }
            } else {
                this.archer.run();
                if (!this.swordsman.slope()) {
                    int damage = archer.meleeAttack();
                    int oldHealth = this.swordsman.getHealth();
                    this.swordsman.setHealth(oldHealth - damage);
                    System.out.println(this.swordsman.getName() + " Получает мощный урон от противника");
                    alive = swordsman.dead();
                    if (!alive) {
                        System.out.println(swordsman.getName() + " героически погибает");
                    }
                } else {
                    System.out.println(this.swordsman.getName() + " уклоняется от атаки");
                }
            }
            countBattle++;
        }
    }
}
