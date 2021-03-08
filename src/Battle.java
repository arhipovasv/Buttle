public class Battle {
    private Elf elf;
    private Human human;
    private int countBattle = 1;

    public Battle(Elf elf, Human human) {
        this.elf = elf;
        this.human = human;
    }

    public void start() {
        boolean alive = true;
        System.out.println("Бой между " + elf.getName() + " и " + human.getName());
        while (alive) {
            if (countBattle % 2 == 1) {
                this.elf.run();
                if (!this.human.getSwordsman().slope()) {
                    int damage = elf.getShooter().attack();
                    int oldHealth = this.human.getHealth();
                    this.human.setHealth(oldHealth - damage);
                    System.out.println(this.human.getName() + " Получает мощный урон от противника");
                    alive = human.dead();
                } else {
                    System.out.println(this.human.getName() + " отбивает атаку");
                }
            } else {
                this.human.run();
                if (!this.elf.getShooter().slope()) {
                    int damage = human.getSwordsman().attack();
                    int oldHealth = this.elf.getHealth();
                    this.elf.setHealth(oldHealth - damage);
                    System.out.println(this.elf.getName() + " Получает мощный урон от противника");
                    alive = elf.dead();
                }else {
                    System.out.println(this.elf.getName() + " уклоняется от атаки");
                }
            }
            countBattle++;
        }
    }
}
