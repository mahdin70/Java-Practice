package com.mukit.medicalcheckup;

public class Patient {
    private String Name;
    private int Age;

    private Eye lefteye;
    private Eye righteye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye lefteye, Eye righteye, Heart heart, Stomach stomach, Skin skin) {
        Name = name;
        Age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Eye getLefteye() {
        return lefteye;
    }

    public void setLefteye(Eye lefteye) {
        this.lefteye = lefteye;
    }

    public Eye getRighteye() {
        return righteye;
    }

    public void setRighteye(Eye righteye) {
        this.righteye = righteye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
