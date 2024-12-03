package javaOOP.models;

import java.time.LocalDate;

public class Dogs extends Pets{
    {
        counter++;
    }

    private static int counter;

    private PetsType petsType;

    public Dogs(String name, LocalDate birthDate, String commads) {
        super(name, birthDate, commads);
        this.petsType = PetsType.DOG;
    }
    public static int getCounter() {
        return counter;
    }

    public String toString() {
        return String.format("Тип: %s; Имя: %s; Дата рожения: %tD; Команды: %s", petsType, name, birthDate, commads);
    }
}
