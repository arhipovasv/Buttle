import java.util.Random;

public class Archer extends Soldier implements DistantBattle {

    public Archer(String name) {
        super.name = name;
    }

    @Override
    void run() {
        System.out.println(this.getName() + " выпускает град стрел в противника");
    }

    @Override
    boolean dead() {
        return this.getHealth() > 0;
    }

    @Override
    public int meleeAttack() {
        Random random = new Random();
        return random.nextInt(14);
    }

    @Override
    public boolean slope() {
        Random random = new Random();
        int slope = random.nextInt(100);
        return slope > 70;
    }
}
