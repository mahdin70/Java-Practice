package com.mukit.medicalcheckup;

public class Eye extends Organ {
    private String Color;
    private boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean isOpen) {
        super(name, medicalCondition);
        Color = color;
        this.isOpen = isOpen;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void Open() {
        this.setOpen(true);
        System.out.println(this.getName() + " is opened!");
    }

    public void Close() {
        this.setOpen(false);
        System.out.println(this.getName() + " is closed!");
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
