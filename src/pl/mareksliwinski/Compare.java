package pl.mareksliwinski;

import java.util.ArrayList;
import java.util.Collections;

public class Compare {

    void sorting(ArrayList<String> arrTab) {
        Collections.sort(arrTab);
    }
    void same(ArrayList<String> arrTab, ArrayList<String> arrTab2) {
        for (String elem : arrTab) {
            int index = Collections.binarySearch(arrTab2, elem);
            if(index >= 0)
                System.out.println(elem);
        }
    }
    void diff (ArrayList<String> arrTab, ArrayList<String> arrTab2){
        for (String elem : arrTab){
            int index = Collections.binarySearch(arrTab2, elem);
            if (index < 0)
                System.out.println(elem);
        }
    }
}
