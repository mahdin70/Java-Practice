package com.mukit.contactsimulation;

public class Message {
    private String Text;
    private String Recipient;
    private int ID;

    public Message(String text, String recipient, int ID) {
        Text = text;
        Recipient = recipient;
        this.ID = ID;
    }

    public void getDetails(){
        System.out.println("Recipient :"+ Recipient +
                           "Message :"+ Text +
                           "ID :" + ID);

    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getRecipient() {
        return Recipient;
    }

    public void setRecipient(String recipient) {
        Recipient = recipient;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
