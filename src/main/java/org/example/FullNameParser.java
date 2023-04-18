package org.example;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your full name: ");
        String fullName = input.nextLine();

        String [] names = fullName.split(" ");
        String firstName = names [0];
        String lastName = names[names.length -1];
        String middleName = "" ;

        if (names.length > 2) {
            int i = 1;
            middleName += names[i] + " ";
        }
        middleName = middleName.trim();

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        }

    }

