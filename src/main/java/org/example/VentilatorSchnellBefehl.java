package org.example;

public class VentilatorSchnellBefehl implements Befehl{

    Ventilator ventilator;
    int letzteGeschwindigkeit;

    public VentilatorSchnellBefehl(Ventilator ventilator){
    this.ventilator = ventilator;

    }

    public void ausfuehren(){
        letzteGeschwindigkeit = ventilator.getStufe();
        ventilator.schnell();
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