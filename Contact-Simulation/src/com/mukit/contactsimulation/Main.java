package com.mukit.contactsimulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contact> contacts;
    private static Scanner scan;

    public static void main(String[] args){
        contacts = new ArrayList<>();
        System.out.println("Welcome Stranger !");

        showInitialOptions();
    }
    private static void showInitialOptions(){
        System.out.println("Please Select One :"+
                           "\n\t1.Manage Contacts"+
                           "\n\t2.Quit");

        scan = new Scanner(System.in);
        int choice = scan.nextInt();

        if(choice == 1) {
            manageContacts();
        }
        else{
            showInitialOptions();
        }
    }

    private static void manageContacts(){
        System.out.println("Please Select One:"+
                           "\n\t1. Show All Contacts"+
                           "\n\t2. Add a New Contact"+
                           "\n\t3. Search for a Contact"+
                           "\n\t4. Delete a Contact"+
                           "\n\t5. Go Back");

        int choice = scan.nextInt();
        switch(choice){
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void deleteContact() {
        System.out.println("Enter the Name you want to Delete !");
        String Name = scan.next();

        if(Name.equals("")){
            System.out.println("Please Enter the Name..");
            deleteContact();
        }
        else{
            boolean doesExist = false;
            for(Contact c:contacts){
                if(c.getName().equals(Name)){
                    doesExist = true;
                    contacts.remove(c);
                }
            }
            if(!doesExist){
                System.out.println("Contact not Found!");
            }
        }
        showInitialOptions();
    }

    private static void searchForContact() {
        System.out.println("What are you searching for ?");
        String Name = scan.next();

        if(Name.equals("")){
            System.out.println("Please, Enter the Name :");
            searchForContact();
        }
        else{
            boolean doesExist = false;
            for(Contact c: contacts){
                if(c.getName().equals(Name)){
                    doesExist = true;
                    c.getDetails();
                }
            }
            if(!doesExist){
                System.out.println("Contacts not found!");
            }
        }
        showInitialOptions();
    }

    private static void addNewContact() {
        System.out.println("Adding a New Contact");
        System.out.println("Enter Contact's Name : ");
        String Name = scan.next();
        System.out.println("Enter Contact's Number : ");
        String Number = scan.next();
        System.out.println("Enter Email : ");
        String Email = scan.next();

        if (Name.equals("") || Number.equals("") || Email.equals("")) {
            System.out.println("Please Enter All Information..");
            addNewContact();
        } else {
            boolean doesExist = false;
            for (Contact c : contacts) {
                if (c.getName().equals(Name)) {
                    doesExist = true;
                } else {
                    Contact contact = new Contact(Name, Number, Email);
                    contacts.add(contact);
                    System.out.println(Name + " added Successfully !");
                }
            }
        }
        showInitialOptions();
    }
    
    private static void showAllContacts() {
        for(Contact c:contacts){
            c.getDetails();
            System.out.println("*****************************************");
        }
        showInitialOptions();
    }

}
