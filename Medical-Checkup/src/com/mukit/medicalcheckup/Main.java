package com.mukit.medicalcheckup;

import java.util.Scanner;

public class Main {
    private static void main(String[] args){
        Patient patient = new Patient("Brad",20,
                new Eye("Left Eye","Short-Sighted","Brown",true),
                new Eye("Left Eye","Normal","Brown",true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach","Infected",false),
                new Skin("Skin","Allergic","Blonde",45));

        System.out.println("Patient Name : " + patient.getName());
        System.out.println("Age : " + patient.getAge());

        Scanner scan = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish) {
            System.out.println("Choose an Organ :" +
                    "\n\t1.Right Eye"+
                    "\n\t2.Left Eye"+
                    "\n\t3.Heart"+
                    "\n\t4.Stomach"+
                    "\n\t5.Skin"+
                    "\n\t6.Quit");

            int choice = scan.nextInt();

            switch(choice){
                case 1 :
                    patient.getLefteye().getDetails();
                    if(patient.getLefteye().isOpen()){
                        System.out.println("\t\t1.Close the Eye");
                        if(scan.nextInt() ==1){
                            patient.getLefteye().Close();
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        System.out.println("\t\t1.Open the Eye!");
                        if(scan.nextInt()==1){
                            patient.getLefteye().Open();
                        }
                        else{
                            continue;
                        }
                    }
                    break;

                case 2 :
                    patient.getRighteye().getDetails();
                    if(patient.getRighteye().isOpen()){
                        System.out.println("\t\t1.Close the Eye");
                        if(scan.nextInt() ==1){
                            patient.getRighteye().Close();
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        System.out.println("\t\t1.Open the Eye!");
                        if(scan.nextInt()==1){
                            patient.getRighteye().Open();
                        }
                        else{
                            continue;
                        }
                    }
                    break;

                case 3 :
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1.Change the heart rate!");

                    if(scan.nextInt() == 1){
                        System.out.println("Enter New Heart Rate :");
                        int newHeartRate = scan.nextInt();
                        patient.getHeart().setRate(newHeartRate);

                        System.out.println("Heart Rate Changed to "+ patient.getHeart().getRate());
                    }
                    else{
                        continue;
                    }
                    break;

                case 4 :
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1.Digest");

                    if(scan.nextInt() == 1){
                        patient.getStomach().Digest();
                    }
                    else{
                        continue;
                    }
                    break;

                case 5 :
                    patient.getSkin().getDetails();
                    break;

                default :
                    shouldFinish = true;
                    break;
            }
        }
    }
}
