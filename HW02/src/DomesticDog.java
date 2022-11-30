import java.util.Objects;

public class DomesticDog extends Dog{
    private String type;

    public DomesticDog(String name, double weight, int energyLevel, String type) {
        super(name, weight, energyLevel);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.toString()+ "Type: " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DomesticDog that = (DomesticDog) o;

        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
