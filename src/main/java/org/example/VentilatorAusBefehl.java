package org.example;

public class VentilatorAusBefehl implements Befehl {

    Ventilator ventilator;

    public VentilatorAusBefehl(Ventilator ventilator){
        this.ventilator = ventilator;
    }
    public void ausfuehren(){
        ventilator.aus();
    }

    public void rueckgaengig(){
        ventilator.schnell();
    }
}
