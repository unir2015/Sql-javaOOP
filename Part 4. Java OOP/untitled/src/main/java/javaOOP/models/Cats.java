package javaOOP.models;

import java.time.LocalDate;

public class Cats extends Pets{
    {
        counter++;
    }

    private static int counter;

    private PetsType petsType;

    public Cats(String name, LocalDate birthDate, String commads) {
        super(name, birthDate, commads);
        this.petsType = PetsType.CAT;
    }
    public static int getCounter() {
        return counter;
    }
    public static String getPetsType(){
        String petsType1 = getPetsType();
        return petsType1;
    }

    public String toString() {
        return String.format("Тип: %s; Имя: %s; Дата рожения: %tD; Команды: %s", petsType, name, birthDate, commads);
    }

}
