public abstract class Human {
    private String name;
    private CloseButtle closeButtle;
    private int health = 100;

    public Human(String name, CloseButtle closeButtle) {
        this.name = name;
        this.closeButtle = closeButtle;
    }

    abstract void run();
    abstract boolean dead();

    public String getName() {
        return name;
    }

    public CloseButtle getSwordsman() {
        return closeButtle;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
