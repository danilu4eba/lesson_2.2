public class bear extends Animal {
    private int mass;
    private int monthInHibernation;
    private String name;

    public int getMass() {
        return mass;
    }

    public int getMonthInHibernation() {
        return monthInHibernation;
    }

    public String getName() {
        return name;
    }

    public bear(int mass, int monthInHibernation) {
        super();

        this.mass = mass;
        this.monthInHibernation = monthInHibernation;
    }

    @Override
    public void print() {
        System.out.println("масса " + this.mass + " время в спячке " + this.monthInHibernation);
    }
}
