package com.tms.lesson11_hw.run;

import com.tms.lesson11_hw.methods.MethodSecondTask;
import com.tms.lesson11_hw.methods.MethodThirdTask;
import com.tms.lesson11_hw.methods.MethodsFirstTask;

public class Run {
    public static void main(String[] args) {
        String document = "3214-abC-8112-kNM-1a2b";
        String string = "It's just a random string";

        System.out.println(MethodsFirstTask.task1(document));
        System.out.println(MethodsFirstTask.task2(document));
        System.out.println(MethodsFirstTask.task3(document));
        MethodsFirstTask.task4(document);
        MethodsFirstTask.task5(document);
        MethodsFirstTask.task6(document);
        MethodsFirstTask.task7(document);

        MethodSecondTask.findTheBiggestWord(string);
        MethodSecondTask.findTheShortestWord(string);

        MethodThirdTask.doubledNewLine("Assalam alaikum");


    }
}
