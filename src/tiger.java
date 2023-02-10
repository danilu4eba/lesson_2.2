public class tiger extends Animal {
    private String color;
    private int distanceTraveled;

    public tiger(String color, int distanceTraveled) {
        super();
        this.color = color;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public void print() {
        System.out.println("цвет " + this.color + " пройденное расстоние " + this.distanceTraveled);

    }
}
