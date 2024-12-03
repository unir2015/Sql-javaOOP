package javaOOP.SaveWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WriteFile {
    private File file;

    public void writeFile() throws IOException {
        if(!file.exists()){
            System.out.println("Нет записи");
        }
        FileReader reader = new FileReader("Animals.txt");
        char[] array = new char[800];
        reader.read(array);
        for (char c : array){
            if(c == '\u0000'){
                break;
            }
            System.out.println(c);

        }
        reader.close();
    }

}
