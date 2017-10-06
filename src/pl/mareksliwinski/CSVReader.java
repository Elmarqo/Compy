package pl.mareksliwinski;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    String fileName;

    void setFileName(String fileName){
        this.fileName = fileName;
    }
    String getFileName(){
        return fileName;
    }

    public void loader(String fileName) {

        File file = new File(fileName);
        if(file.isFile())
            System.out.println("Plik znajduje się w podanej lokalizacji.");
        else
            System.out.println("Brak pliku w podanej lokalizacji!!!");

        String csvFile = "c:/country.csv";
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[0] + " , name=" + country[3] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}