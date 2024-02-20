package com.tms.lesson11_hw.methods;

public class MethodSecondTask {
    public static void findTheShortestWord(String string){
        String[] mas = string.split(" ");
        String min = mas[0];

        for (int i = 0; i< mas.length; i++){
            if (min.length() >= mas[i].length()){
                min = mas[i];
            }
        }
        System.out.println(min);
    }
    public static void findTheBiggestWord(String string){
        String[] mas = string.split(" ");
        String max = mas[0];
        for (int i = 0; i< mas.length; i++){
            if (max.length() <= mas[i].length()){
                max = mas[i];
            }
        }
        System.out.println(max);
    }

}
