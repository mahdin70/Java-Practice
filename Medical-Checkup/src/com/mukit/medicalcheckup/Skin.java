package com.mukit.medicalcheckup;

public class Skin extends Organ {
    private String Color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        Color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin Color: " + this.getColor());
        System.out.println("Softness: " + this.getSoftness());
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
