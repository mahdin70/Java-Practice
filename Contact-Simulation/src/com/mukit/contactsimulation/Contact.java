package com.mukit.contactsimulation;

import java.util.ArrayList;

public class Contact {
    private String Name;
    private String Number;
    private String Email;
    private ArrayList<Message> messages;


    public void getDetails(){
        System.out.println("Name :" + this.Name +
                           "\nNumber :"+ this.Number+
                           "\nEmail :" + this.Email);
    }

    public Contact(String name, String number, String email, ArrayList<Message> messages) {
        Name = name;
        Number = number;
        Email = email;
        this.messages = messages;
    }

    public Contact(String name, String number, String email) {
        Name = name;
        Number = number;
        Email = email;
        this.messages = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
