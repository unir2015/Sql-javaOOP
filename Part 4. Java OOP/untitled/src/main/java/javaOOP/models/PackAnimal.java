package javaOOP.models;

import java.time.LocalDate;

public class PackAnimal extends Animals{

    {
        counter++;
    }

    private AnimalType animalType;
    private static int counter;

    protected PackAnimal(String name, LocalDate birthDate, String commads) {
        super(name, birthDate, commads);
        this.animalType = AnimalType.PackAnimal;
    }

    public static int getCounter() {
        return counter;
    }



}
