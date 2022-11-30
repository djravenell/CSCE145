import java.util.Objects;

public class Wolf extends Dog{
    private String packLeaderName;

    public Wolf(String name, double weight, int energyLevel, String packLeaderName) {
        super(name, weight, energyLevel);
        this.packLeaderName = packLeaderName;
    }

    public String getPackLeaderName() {
        return packLeaderName;
    }

    public void setPackLeaderName(String packLeaderName) {
        this.packLeaderName = packLeaderName;
    }

    public String toString() {
        return super.toString()+ "Pack Leader Name: " + packLeaderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Wolf wolf = (Wolf) o;

        return Objects.equals(packLeaderName, wolf.packLeaderName);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (packLeaderName != null ? packLeaderName.hashCode() : 0);
        return result;
    }
}
