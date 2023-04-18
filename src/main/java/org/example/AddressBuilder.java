package org.example;

import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner inputAddresses = new Scanner(System.in);

        String fullName;
        String billingStreet;
        String billingCity;
        String billingState;
        String billingZip;
        String shippingStreet;
        String shippingCity;
        String shippingState;
        String shippingZip;

        System.out.println("Please provide the following information: ");

        System.out.println("Full name: ");
        fullName = inputAddresses.nextLine();

        System.out.println("Billing Street: ");
        billingStreet = inputAddresses.nextLine();

        System.out.println("Billing City: ");
        billingCity = inputAddresses.nextLine();

        System.out.println("Billing State: ");
        billingState = inputAddresses.nextLine();

        System.out.println("Billing Zip: ");
        billingZip = inputAddresses.nextLine();

        System.out.println("Shipping Street: ");
        shippingStreet = inputAddresses.nextLine();

        System.out.println("Shipping City: ");
        shippingCity = inputAddresses.nextLine();

        System.out.println("Shipping State: ");
        shippingState = inputAddresses.nextLine();

        System.out.println("Shipping zip: ");
        shippingZip = inputAddresses.nextLine();

        StringBuilder addresses = new StringBuilder();
        addresses.append("\n");
        addresses.append(fullName).append("\n\n");

        addresses.append("Billing Address\n");
        addresses.append(billingStreet).append("\n");
        addresses.append(billingState).append(" ");
        addresses.append(billingCity).append(" ");
        addresses.append(billingZip).append("\n\n");


        addresses.append("Shipping Address\n");
        addresses.append(shippingStreet).append("\n");
        addresses.append(shippingState);
        addresses.append(shippingCity).append(" ");
        addresses.append(shippingZip);


        System.out.println(addresses.toString());


//        System.out.println("\n"+fullName+"\n");
//        System.out.println("Billing Address:\n" + billingStreet +"\n"+billingCity+"," +" "+billingState +" "+billingZip+ "\n");
//        System.out.println("Shipping Address:\n" + shippingStreet +"\n"+shippingCity+"," +" "+shippingState +" "+shippingZip);
    }


}
