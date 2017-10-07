package pl.mareksliwinski;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    String fileName;
    String [] tabName;

    void setFileName(String fileName){
        this.fileName = fileName;
    }
    void setTabName(String [] tabName){
        this.tabName = tabName;
    }

    String [] getTabName(){
        return getTabName();
    }
    String getFileName(){
        return fileName;
    }

    public void loader(String fileName, String[] tabName) {

        File file = new File(fileName);
        if(file.isFile())
            System.out.println("Plik znajduje się w podanej lokalizacji.");
        else
            System.out.println("Brak pliku w podanej lokalizacji!!!");

        String csvFile = fileName;
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                tabName = line.split(cvsSplitBy);
                System.out.println(tabName[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}