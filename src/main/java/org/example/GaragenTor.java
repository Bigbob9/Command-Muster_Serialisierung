package org.example;

public class GaragenTor {
    String ort;
    public GaragenTor(String ort){
        this.ort = ort;

    }


    public void hoch(){
        System.out.println(ort + " Garage faehrt hoch");
    };
    public void runter(){System.out.println(ort + " Garage faehrt runter");};
    public void halt(){};
    public void lichtEin(){};
    public void lichtAus(){};
}
