package javaOOP.SaveWriteFile;

import javaOOP.models.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class SaveFile {



    private File file;

    public SaveFile(){};
    public void runSaveFileCat(Cats cats) throws IOException {
        if(!file.exists()){
            file = new File(file, "Animals.txt");
        }
        FileWriter fileWriter = new FileWriter("Animals.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(cats);
        printWriter.close();

    }

    public void runSaveFileDogs(Dogs dogs) throws IOException {
        if(!file.exists()){
            file = new File(file, "Animals.txt");
        }
        FileWriter fileWriter = new FileWriter("Animals.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(dogs);
        printWriter.close();

    }

    public void runSaveFileHamsters(Hamsers hamsers) throws IOException {

            file = new File("Animals.txt");

        FileWriter fileWriter = new FileWriter("Animals.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(hamsers);
        printWriter.close();

    }

    public void runSaveFileHorses(Horses horses) throws IOException {
        if(!file.exists()){
            file = new File(file, "Animals.txt");
        }
        FileWriter fileWriter = new FileWriter("Animals.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(horses);
        printWriter.close();

    }

    public void runSaveFileCamels(Camels camels) throws IOException {
        if(!file.exists()){
            file = new File(file, "Animals.txt");
        }
        FileWriter fileWriter = new FileWriter("Animals.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(camels);
        printWriter.close();

    }

    public void runSaveFileDonkeys(Donkeys donkeys) throws IOException {
        if(!file.exists()){
            file = new File(file, "Animals.txt");
        }
        FileWriter fileWriter = new FileWriter("Animals.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(donkeys);
        printWriter.close();

    }
}

