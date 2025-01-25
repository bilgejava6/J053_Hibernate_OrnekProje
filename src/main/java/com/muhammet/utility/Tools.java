package com.muhammet.utility;

import java.util.Scanner;

public class Tools {

    public static String getParameterString(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static long getParameterLong(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    public static int getParameterInteger(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
