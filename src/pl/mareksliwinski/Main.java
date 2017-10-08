package pl.mareksliwinski;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrTab = new ArrayList<>();
        ArrayList<String> arrTab2 = new ArrayList<>();
        Compare compare = new Compare();
        Menu menuList = new Menu();

        menuList.menu();

        CSVReader csvreader = new CSVReader();
        csvreader.setFileName("lista.txt");
        csvreader.loader(csvreader.getFileName(), arrTab);

        CSVReader csvreader2 = new CSVReader();
        csvreader2.setFileName("lista2.txt");
        csvreader2.loader(csvreader2.getFileName(), arrTab2);

        compare.sorting(arrTab);
        compare.sorting((arrTab2));

        System.out.println("Rekordy znajsujące się w Lista1 i Lista2: ");
        compare.same(arrTab, arrTab2);

        System.out.println("Rekordy nie znajsujące się w Lista1 a znajdujące się w Lista2: ");
        compare.diff(arrTab2, arrTab);

        System.out.println("Rekordy nie znajsujące się w Lista2 a znajdujące się w Lista1: ");
        compare.diff(arrTab, arrTab2);
    }
}
