package com.tms.lesson11_hw.methods;

public class MethodsFirstTask {
    public static String task1(String string){
        String[] mas = string.split("-");
        return mas[0] + mas[2];
    }
    public static String task2(String string){
        String[] mas = string.split("-");
        return string.replace(mas[1], "***").replace(mas[3], "***");
    }
    public static String task3(String string){
        String[] mas = string.split("-");
        String newStr = (mas[1] + "/" + mas[3] + "/" +
                mas[4].substring(1,2) + "/" + mas[4].substring(3));
        return newStr;
    }
    public static void task4(String string){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Letters:");
        stringBuilder.append(task3(string).toUpperCase());
        System.out.println(stringBuilder);
    }
    public static void task5(String string){
        if (string.toUpperCase().contains("ABC")){
            System.out.println("The string has the sequence \"abc\"");
        }else {
            System.out.println("The string does not have the sequence \"abc\"");
        }
    }
    public static void task6(String string){
        if (string.startsWith("555")){
            System.out.println("The line starts with the sequence \"555\"");
        }else {
            System.out.println("The line does not start with the sequence \"555\"");
        }
    }
    public static void task7(String string){
        if (string.endsWith("1a2b")){
            System.out.println("The line ends with the sequence \"1a2b\"");
        }else {
            System.out.println("The line does not end with the sequence \"1a2b\"");
        }
    }
}
