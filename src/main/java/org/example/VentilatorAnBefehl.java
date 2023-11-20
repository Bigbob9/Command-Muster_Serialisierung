package org.example;

public class VentilatorAnBefehl implements Befehl{

    Ventilator ventilator;

    public VentilatorAnBefehl(Ventilator ventilator){
    this.ventilator = ventilator;

    }

    public void ausfuehren(){
        ventilator.schnell();
    }

    public void rueckgaengig() {
        ventilator.aus();
    }
}