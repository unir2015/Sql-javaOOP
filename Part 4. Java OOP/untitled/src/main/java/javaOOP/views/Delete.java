package javaOOP.views;

import java.util.Scanner;

public class Delete {
    private Delete del;
    private Scanner scanner;

    public Delete(Delete del) {
        this.del = del;
    }
    public Delete(){};

    public void runDelete(long id) {
        boolean run = true;
        scanner = new Scanner(System.in);
        while (run) {
            try {
                dispalyAttentionDelete();
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


    private void dispalyAttentionDelete () {
        System.out.println("Вы действительно хотите удалить животное");
        System.out.println(" '0' - Отмена");
        System.out.println(" '1' - Да");
        System.out.println(" '2' - Нет");
    }


}

