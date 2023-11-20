package org.example;

public class Licht {

    String ort;
    public Licht(String ort){
        this.ort = ort;

    }
    public void ein(){
        System.out.println(ort + " Licht ein.");
    };
    public void aus(){
        System.out.println(ort + " Licht aus");
    };
}
