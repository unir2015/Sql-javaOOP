package javaOOP.views;

import java.util.Scanner;

public class Rename {
    private Rename rename;
    private Scanner scanner;

    public Rename(Rename rename){
        this.rename = rename;
    }
    public Rename(){};

    public void runDelete(long id) {
        boolean run = true;
        scanner = new Scanner(System.in);
        while (run) {
            try {
                dispalyAttentionRename();
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 0:
                        run = false;
                    case 1:

                    case 2:


                    default:
                        throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
                }
            }

            catch(NumberFormatException ex){
                run = false;
            }

        }
    }


    private void dispalyAttentionRename(){
        System.out.println("Вы действительно хотите переименовать животное");
        System.out.println(" '0' - Отмена");
        System.out.println(" '1' - Да");
        System.out.println(" '2' - Нет");
    }

}
