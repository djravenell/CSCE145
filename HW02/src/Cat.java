import java.util.Objects;

public class Cat extends Animal{
    private String mood;

    public Cat(String name, double weight, String mood) {
        super(name, weight);
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String toString() {
        return super.toString()+ "Mood: "+ mood + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return Objects.equals(mood, cat.mood);
    }

    @Override
    public int hashCode() {
        return mood != null ? mood.hashCode() : 0;
    }
}
