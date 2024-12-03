package javaOOP.models;

import java.time.LocalDate;
import java.util.Arrays;

import java.util.stream.Collectors;

public abstract class Animals {
    {
        animalCounter++;
    }



    protected String name;
    protected LocalDate birthDate;
    protected String commads;

    protected static int animalCounter;

    private void processName(String name){
        if(name == null){
            throw new NullPointerException("Пустое значение");
        }

        if(name.length() < 3){
            throw new RuntimeException("ВВидите Имя коректтно");
        }

        if(name.matches("0-9")){
            throw new RuntimeException("Не используйте цифры и знаки припинания ");
        }
        else {
            this.name = name;
        }
    }
    private void processBirthDate(LocalDate birthDate){
        LocalDate minData = LocalDate.of(1990,01,01);
        if (birthDate.isBefore(minData) || birthDate.isAfter(LocalDate.now())) {
            throw new RuntimeException("Некорректно указана дата");
        }
        else{
            this.birthDate = birthDate;
        }

    }
    private void processCommands(String commads){
        if(RepetitionOfWorlds(commads)){
            throw new RuntimeException("Команды не могут повторяться");
        }
        if(commads == null){
            throw new NullPointerException("Заполните поле");
        }
        if(commads.length() < 3){
            throw new RuntimeException("Некоректные данные");
        }
        else {
            this.commads = commads;
        }
    }
    protected Animals(String name, LocalDate birthDate, String commads){
        processName(name);
        processBirthDate(birthDate);
        processCommands(commads);
    }
    protected Animals(){

    }


    public static int getAnimalCounter() {
        return animalCounter;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCommads() {
        return commads;
    }

    public void setName(String name) {
        processName(name);
    }

    public void setBirthDate(LocalDate birthDate) {
        processBirthDate(birthDate);
    }

    public void setCommads(String commads) {
        processCommands(commads);
    }




    private boolean RepetitionOfWorlds(String str){
        String temp = Arrays.stream(str.split("\\W+?")).distinct().collect(Collectors.joining(", "));
        if(!temp.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public String toString() {
        return String.format("Имя: %s; Дата рожения: %tD; Команды: %s", name, birthDate, commads);
    }
}
