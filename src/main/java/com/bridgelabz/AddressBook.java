package com.bridgelabz;
import java.util.Scanner;

public class AddressBook {
    ContactDetails person;
    Scanner sc = new Scanner(System.in);

    public void addDetails() {
        person = new ContactDetails();

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code of your area: ");
        Long zipCode = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNum = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = sc.nextLine();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZipCode(zipCode);
        person.setPhoneNumber(phoneNum);
        person.setEmail(email);

    }

    public void editContact() {
        System.out.println("Enter the firstName of person");
        String editName = sc.nextLine();
        if (editName.equalsIgnoreCase(person.firstName)) {
            addDetails();
        } else {
            System.out.println("The name does not match the AddressBook");
            System.out.println("Please enter valid First Name");
            editContact();
        }
    }
}