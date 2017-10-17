package pl.mareksliwinski;


import java.util.ArrayList;
import java.util.Scanner;

class Menu {

    void menu(){
        System.out.println("***************** CompyJ *****************");
        //System.out.println("");
        //System.out.println("");
        System.out.println("1. Rekordy znajdujace sie w Lista i Lista2");
        System.out.println("2. Rekordy znajdujace sie w Lista2 a nie znajdujace sie w Lista");
        System.out.println("3. Rekordy znajdujace sie w Lista a nie znajdujace sie w Lista2");
        System.out.println("4. Wyjscie z Aplikacji");
        System.out.println("*****************************************");
        System.out.println("");
    }
    void choiceSwitch (ArrayList<String>arrTab, ArrayList<String>arrTab2){

        Compare compare = new Compare();

        Scanner input = new Scanner(System.in);
        String press = input.nextLine();

        do {

            switch (press) {
                case "1":
                    System.out.print("\nLiczba rekordow znajdujacych sie w Lista i Lista2 wynosi: ");
                    compare.same(arrTab, arrTab2, "OneToOne.txt");
                    System.out.print("\nWYBIERZ POROWNANIE: ");
                    break;
                case "2":
                    System.out.print("\nLiczba rekordow znajdujacych sie w Lista2, a nie znajdujacych sie w Lista wynosi: ");
                    compare.diff(arrTab2, arrTab, "SecondNotOne.txt");
                    System.out.print("\nWYBIERZ POROWNANIE: ");
                    break;
                case "3":
                    System.out.print("\nLiczba rekordow znajdujacych sie w Lista, a nie znajdujacych sie w Lista2 wynosi: ");
                    compare.diff(arrTab, arrTab2, "FirstNotSecond.txt");
                    System.out.print("\nWYBIERZ POROWNANIE: ");
                    break;
                case "4":
                    System.out.print("Wyjscie z aplikacji");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wybór z poza MENU. Wybierz 1, 2 lub 3.");
            }
            press = input.nextLine();

        }while (press.equals("1") || (press.equals("2") || press.equals("3")));
    }
}