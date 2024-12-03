package javaOOP.models;

import java.time.LocalDate;

public class Pets extends Animals{
    {
        counter++;
    }

    private AnimalType animalType;
    private static int counter;

    protected Pets(String name, LocalDate birthDate, String commads) {
        super(name, birthDate, commads);
        this.animalType = AnimalType.Pets;
    }


    public static int getCounter() {
        return counter;
    }
}
