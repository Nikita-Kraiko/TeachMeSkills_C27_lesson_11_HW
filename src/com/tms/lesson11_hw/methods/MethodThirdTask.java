package com.tms.lesson11_hw.methods;

public class MethodThirdTask {
    public static void doubledNewLine(String string) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i< string.length(); i++){
            str.append(string.charAt(i)).append(string.charAt(i));
        }
        System.out.println(str);
    }
}