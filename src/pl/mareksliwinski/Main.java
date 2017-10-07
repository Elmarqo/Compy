package pl.mareksliwinski;

public class Main {

    public static void main(String[] args) {
        CSVReader csvreader = new CSVReader();
        CSVReader csvreader2 = new CSVReader();

        String [] lista = new String[5];
        String [] lista2 = new String[5];
     
        csvreader.setFileName("lista.csv");
        csvreader.setTabName(lista);

        csvreader2.setFileName("lista2.csv");
        csvreader2.setTabName(lista2);

        System.out.println(csvreader.getFileName());
        System.out.println(csvreader2.getFileName());
       // System.out.println(csvreader2.getTabName());
       csvreader.loader(csvreader.getFileName(), lista);
       //csvreader2.loader(csvreader2.getFileName(), lista2);
    }
}
