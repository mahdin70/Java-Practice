package com.mukit.medicalcheckup;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void Digest(){
        System.out.println("Digesting Begin");
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()){
            System.out.println("Need to be Fed");
        }
        else{
            System.out.println("The Stomach is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
