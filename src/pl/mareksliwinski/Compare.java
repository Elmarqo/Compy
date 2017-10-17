package pl.mareksliwinski;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Compare {

    ArrayList<String> finalData = new ArrayList<>();
    SaveToFile saveToFile = new SaveToFile();
    private String pattern = "###,###.###";
    private DecimalFormat decimalFormat = new DecimalFormat(pattern);
    String resulty = decimalFormat.format(finalData.size());

    void same(ArrayList<String> arrTab, ArrayList<String> arrTab2, String fileName) {
        for (String elem : arrTab) {
            int index = Collections.binarySearch(arrTab2, elem);
            if (index >= 0)
                finalData.add(elem);
        }
        outputFile(finalData, fileName);
        System.out.println(decimalFormat.format(finalData.size()));
        System.out.println("Plik wynikowy " + fileName + " zostal zapisany w katalogu z programem.");
        finalData.clear();
    }
    void diff (ArrayList<String> arrTab, ArrayList<String> arrTab2, String fileName){
        for (String elem : arrTab){
            int index = Collections.binarySearch(arrTab2, elem);
            if (index < 0)
                finalData.add(elem);
        }
        outputFile(finalData, fileName);
        System.out.println(decimalFormat.format(finalData.size()));
        System.out.println("Plik wynikowy " + fileName + " zostal zapisany w katalogu z programem.");
        finalData.clear();
    }
    void outputFile(ArrayList<String> finalData, String fileName){

        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.flush();

            for(String elem : finalData)
                bw.write(elem + "\n");

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}