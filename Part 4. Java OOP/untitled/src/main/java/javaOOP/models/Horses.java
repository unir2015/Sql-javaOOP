package javaOOP.models;

import java.time.LocalDate;

public class Horses extends PackAnimal{
    {
        counter++;
    }

    private static int counter;

    private PackAnimalType packAnimalType;

    public Horses(String name, LocalDate birthDate, String commads) {
        super(name, birthDate, commads);
        this.packAnimalType = PackAnimalType.HORSE;
    }
    public static int getCounter() {
        return counter;
    }

    public String toString() {
        return String.format("Тип: %s; Имя: %s; Дата рожения: %tD; Команды: %s", packAnimalType, name, birthDate, commads);
    }
}
