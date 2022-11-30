import java.util.Scanner;

public class AnimalFrontEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AnimalCollection collection = new AnimalCollection();
        System.out.println("Welcome to the Cat and Dog Collection!");

        Boolean cont = true;
        while (cont) {
            System.out.println("Would you like to" +
                    "\n1. Add a cat or dog"
            + "\n2. Remove a cat or dog"
            + "\n3. Quit"
            + "\nEnter a selection");

            int ans = Integer.parseInt(in.nextLine());
            switch (ans) {
                case 1:
                    System.out.println("Would you like to add a 1. House Cat," +
                            " 2. A Leopard, 3. A Domestic Dog, or 4. A wolf");
                    int ans2 = Integer.parseInt(in.nextLine());
                    switch (ans2) {
                        case 1:
                            HouseCat houseCat = houseCat();
                            collection.addAnimal(houseCat);
                            break;

                        case 2:
                            Leopard leopard = leopard();
                            collection.addAnimal(leopard);
                            break;

                        case 3:
                            DomesticDog domesticDog = domesticDog();
                            collection.addAnimal(domesticDog);
                            break;

                        case 4:
                            Wolf wolf = wolf();
                            collection.addAnimal(wolf);
                            break;
                    }

                    System.out.println("Current collection");
                    collection.printAnimals();
                    break;

                case 2:
                    System.out.println("Enter the animal's name that is to be removed");
                    String remove = in.nextLine();
                    collection.removeAnimal(remove);
                    System.out.println("Current collection");
                    collection.printAnimals();
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
    }

    private static HouseCat houseCat() {
        Scanner in = new Scanner(System.in);
        String name = "";
        double weight = -1;
        String mood = "";
        String type = "";

        System.out.println("Enter the house cat's name, weight, mood, and type");
        name = in.nextLine();
        while (weight<= 0) {
            weight = Double.parseDouble(in.nextLine());
            if (weight <= 0) {
                System.out.println("Please enter a number greater than 0");
            }
        }
        while (!(mood.equals("Sleepy")||mood.equals("Playful")||mood.equals("Hungry"))) {
            mood = in.nextLine();
            if (!(mood.equals("Sleepy")||mood.equals("Playful")||mood.equals("Hungry"))) {
                System.out.println("Please enter one of the following moods:" +
                        " \nSleepy \nPlayful \nHungry");
            }
        }
        while (!(type.equals("Short Hair")||type.equals("Bombay")||type.equals("Ragdoll")||type.equals("Sphinx")||type.equals("Scottish Fold"))) {
            type = in.nextLine();
            if (!(type.equals("Short Hair")||type.equals("Bombay")||type.equals("Ragdoll")||type.equals("Sphinx")||type.equals("Scottish Fold"))) {
                System.out.println("Please enter one of the following types:" +
                        "\nShort Hair \nBombay \nRagdoll \nSphinx \nScottish Fold");
            }
        }

        return new HouseCat(name, weight, mood, type);
    }

    private static Leopard leopard() {
        Scanner in = new Scanner(System.in);
        String name = "";
        double weight = -1;
        String mood = "";
        int numberOfSpots = 0;

        System.out.println("Enter the leopard's name, weight, mood, and number of spots");
        name = in.nextLine();
        while (weight<= 0) {
            weight = Double.parseDouble(in.nextLine());
            if (weight <= 0) {
                System.out.println("Please enter a number greater than 0");
            }
        }
        while (!(mood.equals("Sleepy")||mood.equals("Playful")||mood.equals("Hungry"))) {
            mood = in.nextLine();
            if (!(mood.equals("Sleepy")||mood.equals("Playful")||mood.equals("Hungry"))) {
                System.out.println("Please enter one of the following moods:" +
                        " \nSleepy \nPlayful \nHungry");
            }
        }
        numberOfSpots = Integer.parseInt(in.nextLine());

        return new Leopard(name, weight, mood, numberOfSpots);
    }

    private static DomesticDog domesticDog() {
        Scanner in = new Scanner(System.in);
        String name = "";
        double weight = -1;
        int energyLevel = -1;
        String type = "";

        System.out.println("Enter the domestic dog's name, weight, energy level, and type");
        name = in.nextLine();
        while (weight<= 0) {
            weight = Double.parseDouble(in.nextLine());
            if (weight <= 0) {
                System.out.println("Please enter a number greater than 0");
            }
        }
        boolean cont = true;
        while (cont) {
            energyLevel = Integer.parseInt(in.nextLine());
            if (energyLevel>=0 && energyLevel<=100) {
                cont = false;
            } else {
                System.out.println("Please enter an energy level from 0 to 100");
            }
        }
        while (!(type.equals("Retriever")||type.equals("Terrier")||type.equals("Husky")||type.equals("Yappy")||type.equals("Mutt"))) {
            type = in.nextLine();
            if (!(type.equals("Retriever")||type.equals("Terrier")||type.equals("Husky")||type.equals("Yappy")||type.equals("Mutt"))) {
                System.out.println("Please enter one of the following types:" +
                        "\nShort Hair \nTerrier \nHusky \nYappy \nMutt");
            }
        }

        return new DomesticDog(name, weight, energyLevel, type);
    }

    private static Wolf wolf() {
        Scanner in = new Scanner(System.in);
        String name = "";
        double weight = -1;
        int energyLevel = -1;
        String packLeaderName = "";

        System.out.println("Enter the wolf's name, weight, energy level, and pack leader name");
        name = in.nextLine();
        while (weight<= 0) {
            weight = Double.parseDouble(in.nextLine());
            if (weight <= 0) {
                System.out.println("Please enter a number greater than 0");
            }
        }
        boolean cont = true;
        while (cont) {
            energyLevel = Integer.parseInt(in.nextLine());
            if (energyLevel>=0 && energyLevel<=100) {
                cont = false;
            } else {
                System.out.println("Please enter an energy level from 0 to 100");
            }
        }
        packLeaderName = in.nextLine();

        return new Wolf(name, weight, energyLevel, packLeaderName);
    }
}