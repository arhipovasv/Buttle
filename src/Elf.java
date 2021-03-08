abstract public class Elf {
    private String name;
    private DistantBattle distantBattle;
    private int health = 100;

    public Elf(String name, DistantBattle distantBattle) {
        this.name = name;
        this.distantBattle = distantBattle;
    }

    abstract void run();
    abstract boolean dead();

    public String getName() {
        return name;
    }

    public DistantBattle getShooter() {
        return distantBattle;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
