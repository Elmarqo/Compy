package pl.mareksliwinski;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrTab = new ArrayList<>();
        Compare compare = new Compare();

        CSVReader csvreader = new CSVReader();
        csvreader.setFileName("lista.txt");
        csvreader.loader(csvreader.getFileName(), arrTab);
        //csvreader.printOut(arrTab);

        CSVReader csvreader2 = new CSVReader();
        csvreader2.setFileName("lista2.txt");
        csvreader2.loader(csvreader2.getFileName(), arrTab);
        //csvreader2.printOut(arrTab);

        compare.sorting(arrTab);
        compare.printOut(arrTab);
        compare.diff(arrTab, arrTab);
    }
}
