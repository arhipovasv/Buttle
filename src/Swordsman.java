import java.util.Random;

public class Swordsman extends Soldier implements CloseButtle {

    public Swordsman(String name) {
        super.name = name;
    }

    @Override
    void run() {
        System.out.println(this.getName() + " наносит розящий удар мечом");
    }

    @Override
    public int shootAttack() {
        Random random = new Random();
        return random.nextInt(20);
    }

    @Override
    public boolean slope() {
        Random random = new Random();
        int slope = random.nextInt(100);
        return slope > 70;
    }
}
