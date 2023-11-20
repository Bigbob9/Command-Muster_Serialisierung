package org.example;

public class Ventilator {
    String ort;
    public Ventilator(String ort){
        this.ort = ort;

    }
    public void schnell(){
        System.out.println(ort + " Ventilator ist auf schnell");
    };
    public void mittel(){};
    public void langsam(){};
    public void aus(){
        System.out.println(ort + " Ventilator ist aus");
    };
    public void getStufe(){};
}
