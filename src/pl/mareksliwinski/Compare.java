package pl.mareksliwinski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Compare {

    List<String> arrTab2 = new ArrayList<String>();

    void sorting(ArrayList<String> arrTab) {
        Collections.sort(arrTab);
    }

    void diff(ArrayList<String> arrTab, ArrayList<String> arrTab2) {
        //arrTab.removeAll(arrTab);
        for (String elem : arrTab) {
            int as = Collections.binarySearch(arrTab2, elem);
            //System.out.println(as);
            if(as >= 0)
                System.out.println(elem);
        }
    }

    void printOut(ArrayList<String> arrTab) {
        for (int i = 0; i < arrTab.size(); i++)
            System.out.println(arrTab.get(i));
    }
}
