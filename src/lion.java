public class lion extends Animal {
    private int countOChildren;
    private int killedEnemies;

    public lion(int countOChildren, int killedEnemies) {
        super();
        this.countOChildren = countOChildren;
        this.killedEnemies = killedEnemies;
    }

    @Override
    public void print() {
        System.out.println("количество детей " + this.countOChildren + " убито врагов " + this.killedEnemies);

    }
}
