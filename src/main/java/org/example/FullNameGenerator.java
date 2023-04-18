package org.example;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        Scanner inputName = new Scanner(System.in);
        System.out.println("Hello, Please enter first name: ");
        firstName = inputName.next();
        System.out.println("Hello, Please enter middle name: ");
        middleName = inputName.next();

        if (middleName.equals("no")){
            middleName = "";
        }
        System.out.println("Hello, Please enter last name: ");
        lastName = inputName.next();
        System.out.println("Hello, Please enter suffix: ");
        suffix = inputName.next();

        if(middleName.equals("")){
            System.out.println("Your full name is " + suffix + firstName +" "+lastName);
        }
        else {
            System.out.println("Your full name is " + suffix + firstName +" "+ middleName+" "+lastName);

        }
    }
}