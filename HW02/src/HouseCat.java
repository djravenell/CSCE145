import java.util.Objects;

public class HouseCat extends Cat{
    private String type;

    public HouseCat(String name, double weight, String mood, String type) {
        super(name, weight, mood);
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

        HouseCat houseCat = (HouseCat) o;

        return Objects.equals(type, houseCat.type);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
