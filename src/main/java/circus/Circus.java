package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
<<<<<<< HEAD:src/main/java/Circus.java
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
            // some
            // more
            // code
            // here ...

=======

            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
>>>>>>> Upstream/master:src/main/java/circus/Circus.java
        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
<<<<<<< HEAD:src/main/java/Circus.java
        System.out.println("Total value of animal " + calculateValue(animals));
=======
        System.out.println("Total value of animals " + calculateValue(animals));
>>>>>>> Upstream/master:src/main/java/circus/Circus.java
    }
}
