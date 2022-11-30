public class Leopard extends Cat{
    private int numberOfSpots;

    public Leopard(String name, double weight, String mood, int numberOfSpots) {
        super(name, weight, mood);
        this.numberOfSpots = numberOfSpots;
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    public String toString() {
        return super.toString()+ "Number of Spots: " + numberOfSpots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Leopard leopard = (Leopard) o;

        return numberOfSpots == leopard.numberOfSpots;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfSpots;
        return result;
    }
}
