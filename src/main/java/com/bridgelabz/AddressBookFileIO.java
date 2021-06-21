package com.bridgelabz;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AddressBookFileIO {
    public void writeData(Map<String, AddressBook> addressBook) {
        File file = new File("Contacts.txt");
        BufferedWriter bufferedWriter;
        try {
            //create new BufferedWriter for the output file
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            //iterate map entries
            for (Map.Entry<String, AddressBook> entry : addressBook.entrySet()) {
                //put key and value separated by a colon
                bufferedWriter.write(entry.getKey() + ":" + entry.getValue());
                //new line
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    // public List<Contacts> readData() {
    public static Map<String,  String> readData() {
        Map<String, String> mapFileContents = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            //create file object
            File file = new File("Contacts.txt");

            //create BufferedReader object from the File
            bufferedReader = new BufferedReader(new FileReader(file));

            String line;
            //read file line by line
            while ((line = bufferedReader.readLine()) != null) {

                //split the line by :
                String[] parts = line.split(":");

                //first part is name, second is age
                String bookName = parts[0].trim();
                String contact = parts[1].trim();

                mapFileContents.put(bookName, contact);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Always close the BufferedReader
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                }
            }
        }
        return mapFileContents;
    }
}

