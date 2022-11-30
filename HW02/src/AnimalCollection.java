import java.lang.reflect.Array;

public class AnimalCollection {
    private static Animal[] animals;
    private static int numOfAnimals;

    public AnimalCollection() {
        animals = new Animal[10];
        numOfAnimals = 0;
    }

    public static void addAnimal(Animal a) {
        animals[numOfAnimals] = a;
        ++numOfAnimals;
    }

    public static void removeAnimal(String s) {
        Boolean cont = true;
        int index = 0;
        while (cont) {
            for (int i = 0; i < numOfAnimals; ++i) {
                if (animals[i].getName().equals(s)) {
                    cont = false;
                    index = i;
                }
            }
        }
        if (!cont) {
            for (int j = index; j < numOfAnimals; ++j) {
                animals[j] = animals[j +1];
            }
            --numOfAnimals;
        }
    }

    public static void printAnimals() {
        for (int i = 0; i < numOfAnimals; ++i) {
            System.out.println(animals[i].toString());
        }
    }
}
