package com.mukit.medicalcheckup;

public class Heart extends Organ {
    private int Rate;

    @Override
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Heart Rate: " + this.getRate());
    }

    public Heart(String name, String medicalCondition, int rate)
    {
        super(name, medicalCondition);
        Rate = rate;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }
}
