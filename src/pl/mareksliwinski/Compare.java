package pl.mareksliwinski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare {

    //CSVReader csvReader = new CSVReader();

    void sorting(ArrayList<String> arrTab) {
        Collections.sort(arrTab);
    }
    void diff (ArrayList<String > arrTab, ArrayList<String> arrTab2){
        arrTab.removeAll(arrTab2);
    }

    void printOut(ArrayList<String> arrTab) {
        for (int i = 0; i < arrTab.size(); i++)
            System.out.println(arrTab.get(i));
    }
}
