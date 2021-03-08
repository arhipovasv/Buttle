public class Archer extends Elf {

    public Archer(String name, DistantBattle distantBattle) {
        super(name, distantBattle);
    }

    @Override
    void run() {
        System.out.println(this.getName() + " выпускает град стрел в противника");
    }

    @Override
    boolean dead() {
        if (this.getHealth() <= 0) System.out.println("Героически погибает");
        return this.getHealth() > 0;
    }
}
