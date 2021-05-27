package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends Contacts {
    Contacts contact = new Contacts();
    Scanner scanner = new Scanner(System.in);

    // Arraylist to store multiple contacts
    ArrayList<Contacts> contactList = new ArrayList<>();


    // add contact
    public Contacts addContact() {
        System.out.println("Enter the details of the contact");

        System.out.println("Enter first name : ");
        String firstName = scanner.next();

        System.out.println("Enter last name : ");
        String lastName = scanner.next();

        System.out.println("Enter address : ");
        String address = scanner.next();

        System.out.println("Enter city : ");
        String city = scanner.next();

        System.out.println("Enter state : ");
        String state = scanner.next();

        System.out.println("Enter zip code : ");
        Long zip = scanner.nextLong();

        System.out.println("Enter phone number : ");
        Long phoneNumber = scanner.nextLong();

        System.out.println("Enter email id : ");
        String emailId = scanner.next();

        contactList.add(new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId));

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmailId(emailId);

        return contact;
    }


    // edit contact
    public void editContact() {
        System.out.println(" Enter the first name of the contact : ");
        String contactFirstName = scanner.next();

        if (contactList.isEmpty()) {
            System.out.println(" Contact List is Empty! ");
        } else {
            for (Contacts contact : contactList) {
                String checkName = contact.getFirstName();

                if (checkName.equalsIgnoreCase(contactFirstName)) {

                    System.out.print("Enter New First Name: ");
                    String firstName = scanner.next();

                    System.out.print("Enter New Last Name: ");
                    String lastName = scanner.next();

                    System.out.print("Enter New Address: ");
                    String address = scanner.next();

                    System.out.print("Enter New City: ");
                    String city = scanner.next();

                    System.out.print("Enter New State: ");
                    String state = scanner.next();

                    System.out.print("Enter New Zip Code of area: ");
                    Long zipCode = scanner.nextLong();

                    System.out.print("Enter New Mobile Number: ");
                    Long phoneNum = scanner.nextLong();

                    System.out.print("Enter New Email Id: ");
                    String email = scanner.next();

                    contact.setFirstName(firstName);
                    contact.setLastName(lastName);
                    contact.setAddress(address);
                    contact.setCity(city);
                    contact.setState(state);
                    contact.setZip(zipCode);
                    contact.setPhoneNumber(phoneNum);
                    contact.setZip(zipCode);
                    contact.setEmailId(email);

                    System.out.println("Contact List Updated! ");
                } else {
                    System.out.println(" Name not found. Enter Valid Name");
                }
            }
        }
    }


    //delete contact
    public void deleteContact() {
        System.out.println("Enter the name of the contact to be deleted : ");
        String deleteName = scanner.next();
        if (contactList.isEmpty()) {
            System.out.println("The AddressBook is Empty....!");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String matcher = contactList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)) {
                    contactList.remove(i);
                    System.out.println("Contact Deleted Successfully...");
                } else {
                    System.out.println("Name Not Found");
                }
            }
        }
    }


    public void showContact() {
        System.out.println("Total Number of Contacts : " + contactList.size());
        System.out.println("---------------------------------------------------");
        if (contactList.isEmpty()) {
            System.out.println("There are no contacts in the contact list");
        } else {
            System.out.println(contactList);
            System.out.println("\n---------------------------------------------");
        }
    }


    public void getMenu() {
        boolean exit = false;
        do {
            System.out.println("Choose the valid option \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    System.out.println("Contact added successfully....");
                    break;
                case 2:
                    editContact();
                    System.out.println("Contact details updated successfully");
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.print("Enter the valid option!");
                    break;
            }
        } while (!exit);
    }
}