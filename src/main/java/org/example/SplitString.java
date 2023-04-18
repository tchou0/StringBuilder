package org.example;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String s = scanner.nextLine();
        System.out.println("You entered: " + s);

        System.out.println(s);
        String[] word = s.split("\\|");

        StringBuilder sb = new StringBuilder();

//        for (String w : word) {
//            if (w.contains("T") || w.contains("t"))
//                sb.append("Word: " );
//                sb.append(w);
//                sb.append("\n");
//
//            System.out.println(sb.toString());
//               // System.out.println("Word : " + w);

    }


//        int i = 0;
//        do{
//            System.out.println( word[i]);
//            i++;
//        }
//        while (i <word.length );

    }

