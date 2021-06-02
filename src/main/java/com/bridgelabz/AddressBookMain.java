package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {

    public static Map<String, AddressBook> addressBookHashMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    // USER INPUT
    public void addDataToAddressBook() {

        String chooseContact, chooseCity;

        do {
            System.out.println("Enter the name of city");
            String city = scanner.nextLine();
            AddressBook addressBook = new AddressBook(city);
            for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                if (entry.getKey().equals(city)) {
                    addressBook = entry.getValue();
                }
            }
            addressBookHashMap.put(city, addressBook);
            do {
                System.out.println("Enter first name:");
                String firstName = scanner.nextLine();

                System.out.println("Enter last name:");
                String lastName = scanner.nextLine();

                System.out.println("Enter address name:");
                String address = scanner.nextLine();

                System.out.println("Enter state name:");
                String state = scanner.nextLine();

                System.out.println("Enter zip code:");
                String zip = scanner.nextLine();

                System.out.println("Enter phone number:");
                String phoneNumber = scanner.nextLine();

                System.out.println("Enter emailId number:");
                String emailID = scanner.nextLine();

                Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, emailID);

                for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(city)) {
                        entry.getValue().addContact(contact);
                    }
                }
                System.out.println("Do you want to add contact again? Yes|No");
                chooseContact = scanner.nextLine();
            } while (chooseContact.equalsIgnoreCase("yes"));
            System.out.println("Do you want to add another city Yes|No");
            chooseCity = scanner.nextLine();
        } while (chooseCity.equalsIgnoreCase("yes"));

        System.out.println(addressBookHashMap);
    }


    //Search Contact By City or State
    public static void searchContactByCityOrState(String city, String name) {
        List<Contact> contactList = new ArrayList<>();

        for (Map.Entry < String, AddressBook > entry : addressBookHashMap.entrySet()) {
            contactList = entry.getValue().getAddressBook().stream().filter(p -> p.getCity().equalsIgnoreCase(city)).filter(p -> (p.getFirstName()).equals(name)).collect(Collectors.toList());
        }
        for (Contact contact : contactList) {
            System.out.println("Search result: " + contact);
        }
    }


    // MAIN METHOD
    public static void main(String[] args) {
        System.out.println(" ---------------------------- Welcome To AddressBook System ------------------------------");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new contact" + "\n" + "2. Edit contact details" + "\n" + "3. Delete contact details" + "\n" +  "4. Search Contact by City or State " + "\n" + "5. Show Contacts" + "\n" + "6. Exit" + "\n" + "Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new AddressBookMain().addDataToAddressBook();
                    break;

                case 2:
                    System.out.println("Enter the address book name (city)");
                    String city = scanner.next();

                    System.out.println("Enter First Name of the contact you want to edit");
                    String checkName1 = scanner.next();

                    for (Map.Entry<String,AddressBook> entry : addressBookHashMap.entrySet()) {
                        if(entry.getKey().equalsIgnoreCase(city)) {
                            entry.getValue().editContactByFirstName(checkName1);
                        }else {
                            System.out.println("The"+ city +" address book does not present.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the address book name (city)");
                    city = scanner.next();

                    System.out.println("Enter First Name of the contact you want to delete");
                    String checkName2 = scanner.next();

                    for (Map.Entry<String,AddressBook> entry : addressBookHashMap.entrySet()) {
                        if(entry.getKey().equalsIgnoreCase(city)) {
                            entry.getValue().deleteContact(checkName2);
                        }else {
                            System.out.println("The"+ city +" address book does not exist.");
                        }
                    }
                    break;

                case 4:
                    String name1;
                    System.out.println("Enter City , First Name you want to search:");
                    String city2 = scanner.next();
                    name1= scanner.next();
                    searchContactByCityOrState(city2, name1);
                    break;

                case 5:
                    for (Map.Entry<String,AddressBook> entry : addressBookHashMap.entrySet()) {
                        System.out.println(entry.getKey() + "\t" + entry.getValue().getAddressBook()); }
            }
        } while(choice != 6);
    }
}