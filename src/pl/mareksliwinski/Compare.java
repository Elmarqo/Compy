package pl.mareksliwinski;
import java.util.ArrayList;
import java.util.Collections;

public class Compare {

    ArrayList<String> finalData = new ArrayList<>();
    SaveToFile saveToFile = new SaveToFile();

    void same(ArrayList<String> arrTab, ArrayList<String> arrTab2) {
        for (String elem : arrTab) {
            int index = Collections.binarySearch(arrTab2, elem);
            if (index >= 0){
                finalData.add(elem);
                saveToFile.outputFile("OneToOne.txt");
            }
        }
        System.out.println(finalData.size());
        finalData.clear();
    }
    void diff (ArrayList<String> arrTab, ArrayList<String> arrTab2){
        for (String elem : arrTab){
            int index = Collections.binarySearch(arrTab2, elem);
            if (index < 0)
                finalData.add(elem);
        }
        System.out.println(finalData.size());
        finalData.clear();
    }
}