package pl.mareksliwinski;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {

    void menu(){
        System.out.println("***************** compyJ *****************");
        //System.out.println("");
        //System.out.println("");
        System.out.println("1. Rekordy znajdujące się w Lista1 i Lista2");
        System.out.println("2. Rekordy nie znajdujące się w Lista1 a znajdujące się w  Lista2");
        System.out.println("3. Rekordy nie znajdujące się w Lista2 a znajdujące się w  Lista1");
        System.out.println("4. Wyjście z Aplikacji");
        System.out.println("*****************************************");
        System.out.println("");
    }
     void choiceSwitch (ArrayList<String>arrTab, ArrayList<String>arrTab2){

        Compare compare = new Compare();

        String press;
        Scanner input = new Scanner(System.in);
        press = input.nextLine();

        do {

            switch (press) {
                case "1":
                    System.out.print("Liczba rekordów znajdujących się w Lista1 i Lista2 wynosi: ");
                    compare.same(arrTab, arrTab2, "OneToOne.txt");
                    System.out.println("\nWYBIERZ PORÓWNANIE: ");
                    break;
                case "2":
                    System.out.print("Liczba rekordów znajdujących się w Lista2 a nie znajdujących się w Lista1 wynosi: ");
                    compare.diff(arrTab2, arrTab, "SecondNotOne.txt");
                    System.out.println("\nWYBIERZ PORÓWNANIE: ");
                    break;
                case "3":
                    System.out.print("Liczba rekordów znajdujących się w Lista1 a nie znajdujących się w Lista2 wynosi: ");
                    compare.diff(arrTab, arrTab2, "FirstNotSecond.txt");
                    System.out.println("\nWYBIERZ PORÓWNANIE: ");
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
