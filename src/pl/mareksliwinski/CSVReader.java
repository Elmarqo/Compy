package pl.mareksliwinski;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CSVReader {

    String fileName;
    ArrayList<String> arrTab = new ArrayList<>();

    //Setter
    void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //Getter
    String getFileName() {
        return fileName;
    }
    ArrayList<String> getArrTab(){
        return arrTab;
    }

    void loader(String fileName) {
        File file = new File(fileName);
        if (!file.isFile())
            System.out.println("Brak pliku w podanej lokalizacji!!!");
        else
            System.out.print("Trwa wczytywanie pliku " + fileName + "... ");

        String csvFile = fileName;
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null)
                arrTab.add(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("OK.");
    }
    void sorting() {
        System.out.print("Sortowanie...");
        Collections.sort(arrTab);
        System.out.println("OK.");
    }

}