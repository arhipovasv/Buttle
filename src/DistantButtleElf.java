import java.util.Random;

public class DistantButtleElf implements DistantBattle {

    @Override
    public int attack() {
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
