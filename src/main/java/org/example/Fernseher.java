package org.example;

public class Fernseher {
    String ort;

    public Fernseher(String ort){
        this.ort = ort;
    }
    public void ein(){
        System.out.println(ort + "Fernseher ist an");
    };
    public void aus(){
        System.out.println(ort + "Fernseher ist aus");
    };
    public void setSender(){};
    public void setLautstärke(){};
}
