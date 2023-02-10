public class wolf extends Animal {
    private int height;
    private int wolvesInPack;

    public wolf(int height, int wolvesInPack) {
        super();
        this.height = height;
        this.wolvesInPack = wolvesInPack;
    }

    @Override
    public void print() {
        System.out.println("рост " + this.height + " волков в стае " + this.wolvesInPack);
    }
}
