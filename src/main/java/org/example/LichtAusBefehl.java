package org.example;



public class LichtAusBefehl implements Befehl {

    Licht licht;

    public LichtAusBefehl(Licht licht){
        this.licht = licht;
    }

    public void ausfuehren(){
        speichern();
        licht.aus();
    }

    @Override
    public void rueckgaengig() {
        licht.ein();
    }

    @Override
    public void speichern() {
        speicher.befehleSpeichern(this);

    }

    @Override
    public void laden() {
licht.aus();
    }
}