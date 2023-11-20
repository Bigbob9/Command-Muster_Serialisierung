package org.example;

public class VentilatorMittelBefehl implements Befehl{

    Ventilator ventilator;
    int letzteGeschwindigkeit;

    public VentilatorMittelBefehl(Ventilator ventilator){
    this.ventilator = ventilator;

    }

    public void ausfuehren(){
        letzteGeschwindigkeit = ventilator.getStufe();
        ventilator.mittel();
    }

    public void rueckgaengig() {
        if(letzteGeschwindigkeit == ventilator.SCHNELL){
            ventilator.schnell();
        } else if(letzteGeschwindigkeit == ventilator.MITTEL){
            ventilator.mittel();
        } else if(letzteGeschwindigkeit == ventilator.LANGSAM){
            ventilator.langsam();
        }else if(letzteGeschwindigkeit == ventilator.AUS){
            ventilator.aus();
        }


    }
}