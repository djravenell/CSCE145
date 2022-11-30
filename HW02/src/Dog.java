public class Dog extends Animal {
    private int energyLevel;

    public Dog(String name, double weight, int energyLevel) {
        super(name, weight);
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public String toString() {
        return super.toString()+ "Energy Level: " + energyLevel + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return energyLevel == dog.energyLevel;
    }

    @Override
    public int hashCode() {
        return energyLevel;
    }
}
