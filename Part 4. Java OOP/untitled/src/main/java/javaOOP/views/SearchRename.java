package javaOOP.views;

import java.util.Scanner;

public class SearchRename {
    private SearchRename searchRename;
    private Scanner scanner;
    SearchRename(SearchRename searchRename){
        this.searchRename = searchRename;
        scanner = new Scanner(System.in);
    }
    SearchRename(){};



    public void Run(long Id){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            try {
                displaySearch();

                switch (Integer.parseInt(scanner.nextLine())) {
                    case 0:
                        run = false;
                    case 1:

                    case 2:


                    default:
                        throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
                }
            } catch (NumberFormatException ex) {
                run = false;
            }
        }

    }





    private void displaySearch(){
        System.out.println(" '0' - Отмена");
        System.out.println(" '1' - Изминить");
        System.out.println(" '2' - Удалить");
    }


}
