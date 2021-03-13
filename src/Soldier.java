public abstract class Soldier {
    protected String name;
    private int health = 100;

    abstract void run();

    boolean dead() {
        if (this.getHealth() <= 0) System.out.println(this.name + " Героически погибает");
        return this.getHealth() > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
