package pl.mareksliwinski;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    String fileName;

    //Setter
    void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //Getter
    String getFileName() {
        return fileName;
    }

    void loader(String fileName, ArrayList<String> arrTab) {
        File file = new File(fileName);
        if (!file.isFile())
            System.out.println("Brak pliku w podanej lokalizacji!!!");


        String csvFile = fileName;
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null)
                arrTab.add(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void printOut(ArrayList<String> arrTab) {
        for (int i = 0; i < arrTab.size(); i++)
            System.out.println(arrTab.get(i));
    }

}
