package pl.mareksliwinski;

public class Main {

    public static void main(String[] args) {
        Menu menuList = new Menu();
        menuList.menu();

        CSVReader csvreader = new CSVReader();
        csvreader.setFileName("lista.txt");
        csvreader.loader(csvreader.getFileName());
        csvreader.sorting();

        CSVReader csvreader2 = new CSVReader();
        csvreader2.setFileName("lista2.txt");
        csvreader2.loader(csvreader2.getFileName());
        csvreader2.sorting();

        System.out.println("WYBIERZ PORÓWNANIE: ");
        menuList.choiceSwitch(csvreader.getArrTab(), csvreader2.getArrTab());
    }
}
