package org.example;



public class LichtAusBefehl implements Befehl {

    Licht licht;

    public LichtAusBefehl(Licht licht){
        this.licht = licht;
    }

    public void ausfuehren(){
        licht.aus();
    }

    @Override
    public void rueckgaengig() {
        licht.ein();
    }
}