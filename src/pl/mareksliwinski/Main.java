package pl.mareksliwinski;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrTab = new ArrayList<>();
        ArrayList<String> arrTab2 = new ArrayList<>();
        Compare compare = new Compare();

        CSVReader csvreader = new CSVReader();
        csvreader.setFileName("lista.txt");
        csvreader.loader(csvreader.getFileName(), arrTab);
        //csvreader.printOut(arrTab);

        CSVReader csvreader2 = new CSVReader();
        csvreader2.setFileName("lista2.txt");
        csvreader2.loader(csvreader2.getFileName(), arrTab2);
        //csvreader2.printOut(arrTab);

        compare.sorting(arrTab);
        compare.sorting((arrTab2));

        compare.same(arrTab, arrTab2);
        compare.printOut(arrTab);

        compare.diff(arrTab, arrTab2);
        compare.printOut(arrTab);

        int [] love;
        int [] kl = new int[45];
        love = kl;
        System.out.println(love.length);
    }
}
