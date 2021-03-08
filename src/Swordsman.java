import java.util.Random;

public class Swordsman extends Human {

    public Swordsman(String name, CloseButtle closeButtle) {
        super(name, closeButtle);
    }

    @Override
    void run() {
        System.out.println(this.getName() + " наносит розящий удар мечом");
    }

    @Override
    boolean dead() {
        if (this.getHealth() <= 0) System.out.println("Героически погибает");
        return this.getHealth() > 0;
    }
}
