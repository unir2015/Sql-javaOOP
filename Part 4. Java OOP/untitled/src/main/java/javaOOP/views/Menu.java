package javaOOP.views;

import java.util.Scanner;



public class Menu {

    private Scanner scanner;
    private Menu menu;
    private SearchRename searchRename;
    Menu(Menu menu) {
        this.menu = menu;
        scanner = new Scanner(System.in);
    }


    void Run(long Id){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        try {
            displayMenu();

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:

                case 2:
                    searchRename.Run(scanner.nextInt());
                case 3:

                case 4:
                    run = false;

                default:
                    throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
            }
        }
        catch (NumberFormatException ex){
            run = false;
        }

    }



    private void displayMenu(){
        System.out.println(" Меню");
        System.out.println(" '1' - Добавить животное");
        System.out.println(" '2' - Поиск животного, удаление, изменение");
        System.out.println(" '3' - Вывести список животных и счетчик");
        System.out.println(" '4' - Выход");
    }





}
