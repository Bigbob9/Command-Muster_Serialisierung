package org.example;

public class LichtAnBefehl implements Befehl {

    Licht licht;

    public LichtAnBefehl(Licht licht){
        this.licht = licht;
    }

    public void ausfuehren(){
        speichern();
        licht.ein();
    }

    @Override
    public void rueckgaengig() {
        licht.aus();
    }

    @Override
    public void speichern() {
        speicher.befehleSpeichern(this);

    }

    @Override
    public void laden() {
        licht.ein();

    }
}
