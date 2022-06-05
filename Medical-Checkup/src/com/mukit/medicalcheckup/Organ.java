package com.mukit.medicalcheckup;

public class Organ
{
    private String Name;
    private String MedicalCondition;

    public void getDetails()
    {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedicalCondition());
    }

    public Organ(String name, String medicalCondition)
    {
        Name = name;
        this.MedicalCondition = medicalCondition;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMedicalCondition() {
        return MedicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.MedicalCondition = medicalCondition;
    }
}
