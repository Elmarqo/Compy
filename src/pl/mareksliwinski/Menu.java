package pl.mareksliwinski;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    void menu(){
        System.out.println("***************** COMPY *****************");
        //System.out.println("");
        //System.out.println("");
        System.out.println("1. Rekordy znajdujące się w Lista1 i Lista2");
        System.out.println("2. Rekordy nie znajdujące się w Lista1 a znajdujące się w  Lista2");
        System.out.println("3. Rekordy nie znajdujące się w Lista2 a znajdujące się w  Lista1");
        System.out.println("4. Wyjście z aplikacji");
        System.out.println("*****************************************");
        System.out.println("");
    }
     void choiceSwitch (ArrayList<String>arrTab, ArrayList<String>arrTab2){

        Compare compare = new Compare();
        Main main = new Main();

        String press;
        Scanner input = new Scanner(System.in);
        press = input.nextLine();

        do {

            switch (press) {
                case "1":
                    System.out.println("Liczba rekordów znajdujących się w Lista2 i znajdujących się w Lista1 wynosi: ");
                    compare.same(arrTab, arrTab2);
                    menu();
                    break;
                case "2":
                    System.out.println("Liczba rekordów nie znajdujących się w Lista2 a znajdujących się w Lista1 wynosi: ");
                    compare.diff(arrTab2, arrTab);
                    menu();
                    break;
                case "3":
                    System.out.println("Liczba rekordów nie znajdujących się w Lista2 a znajdujących się w Lista1 wynosi: ");
                    compare.diff(arrTab, arrTab2);
                    menu();
                    break;
                case "4":
                    System.out.println("Wyjście z aplikacji");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wybór z poza MENU. Wybierz 1, 2 lub 3.");
            }
            press = input.nextLine();

        }while (press.equals("1") || (press.equals("2") || press.equals("3")));
    }
}
