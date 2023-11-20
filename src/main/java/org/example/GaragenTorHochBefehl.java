package org.example;

public class GaragenTorHochBefehl implements Befehl {

    GaragenTor garagenTor;
    public GaragenTorHochBefehl(GaragenTor garagenTor) {
        this.garagenTor = garagenTor;
    }

    public void ausfuehren(){
        garagenTor.hoch();
    }

    public void rueckgaengig(){
        garagenTor.runter();
    }
}
