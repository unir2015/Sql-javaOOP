package javaOOP;

import javaOOP.SaveWriteFile.SaveFile;
import javaOOP.models.Hamsers;

import java.io.IOException;
import java.time.LocalDate;


import java.util.Scanner;


public class program {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2001,02,01);
        Hamsers hamsers = new Hamsers("saassa",localDate,"dddd");
        SaveFile saveFile = new SaveFile();
        try {
            saveFile.runSaveFileHamsters(hamsers);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void rr() {

        Scanner scanner = new Scanner(System.in);
        boolean asd = true;
        while (asd){
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("1");

                case 2:
                    System.out.println("2");

            }

        }

    }


//        String h = "ds?,-                        fjfjf, jfjjfo, jfjjfo, kkfkf";
//
//
////        LocalDate datwe;
////        datwe = LocalDate.of(1991, 12, 12);
////        System.out.println(datwe.isAfter(LocalDate.now()));
////        System.out.println(datwe.isBefore(LocalDate.now()));
//
//
////        name(h);
//
////        Set<String> s1et = new HashSet<String>();
////        s1et.add("9");
//
//          System.out.println(h);
////        processCommands(s1et);
//
//
////        mainn(h);
////        for (int i = 0; i < h.length; i++) {
////            System.out.println(h[i]);
////        }
////        String g = deDup(h);
////        System.out.println(g);
//          mainFoor(h);
//
//        System.out.println(mainFife(h));
//
//
//    }
//
//    public static void name(String name) {
//        if (name == null) {
//            throw new NullPointerException("Пустое значение");
//        }
//
//        if (name.length() < 3) {
//            throw new RuntimeException("ВВидите Имя коректтно");
//        }
//        if (!name.matches("-?\\d+(\\.\\d+)?")) {
//            System.out.println("есть чистла");
//        } else {
//            System.out.println("ttttteeeeee");
//
//        }
//
//
//    }
//
//    public void checkArray(Integer[] args) {
//        if (args == null) throw new RuntimeException("Не инициализирован объект");
//        for (int i = 0; i < args.length; i++) {
//            if (args[i] == null) System.out.printf("null под индексом: %d\n", i);
//        }
//
//    }
//
//    public static boolean isNumeric(String str) {
//        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
//    }
//
//    public static void processCommands(Set<String> commads) {
//        int d = 9;
//        if (commads.contains(d)) {
//            System.out.println("Не используйте цифры");
//        } else {
//            System.out.println("не работает");
//        }
//
//
//    }
//
//    public static void mainn(String args) {
//        String duplicatePattern = "\\b([\\w\\s']+) \\1\\b";
//        Pattern p = Pattern.compile(duplicatePattern);
//        String[] str = args.split(" ");
//        for (String phrase : str) {
//            Matcher m = p.matcher(phrase);
//            if (m.matches()) {
//                System.out.println("норм");
//            } else {
//                System.out.println("no working");
//            }
//        }
//
//
//    }
//    public static void mainTwo(String s){
//
//        Set<String> temp = new LinkedHashSet<>();
//        String[] arr = s.split(" ");
//
//        for ( String ss : arr)
//            temp.add(ss);
//
//        String newl = temp.toString()
//                .replace("[","")
//                .replace("]","")
//                .replace(",","");
//
//        System.out.println(newl);
//    }
//    public static void mainFree(String s) {
//        String str = s;
//        str.replaceAll("(\\b\\w+\\b)-(?=.*\\b\\1\\b)", "");
//
//
//
//    }
//    public static String deDup(String s) {
//        return Arrays.stream(s.split(", ")).distinct().collect(Collectors.joining(", "));
//    }
//    public static void mainFoor(String str){
//        String s = Arrays.stream(str.split("\\W+?")).distinct().collect(Collectors.joining(", "));
//        if(!s.equals(str)){
//            System.out.println("не равны");
//        }
//        else
//            System.out.println("равны");
//    }
//    public static boolean mainFife(String str){
//        String s = Arrays.stream(str.split("\\W+?")).distinct().collect(Collectors.joining(", "));
//        if(!s.equals(str)){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }



}

