package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBook addressBook = new AddressBook();
        addressBook.addDetails();

        System.out.println("Address Book details:");
        System.out.println(addressBook.person);

        System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
        int op = sc.nextInt();

        switch (op){
            case 1:
                addressBook.editContact();
                System.out.println("You have Entered following data");
                System.out.println(addressBook.person);
                System.out.println("Thank you for Using the Address book");
                break;
            case 2:
                addressBook.delete();
                System.out.println("Addess Book details :"+addressBook.person);
                break;
        }
    }
}