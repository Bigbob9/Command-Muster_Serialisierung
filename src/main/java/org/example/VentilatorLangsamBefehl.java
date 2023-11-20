package org.example;

public class VentilatorLangsamBefehl implements Befehl{

    Ventilator ventilator;
    int letzteGeschwindigkeit;

    public VentilatorLangsamBefehl(Ventilator ventilator){
    this.ventilator = ventilator;

    }

    public void ausfuehren(){
        letzteGeschwindigkeit = ventilator.getStufe();
        ventilator.langsam();
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