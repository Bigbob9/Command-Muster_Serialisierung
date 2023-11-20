package org.example;

public class GaragenTorRunterBefehl implements Befehl{

    GaragenTor garagenTor;
    public GaragenTorRunterBefehl(GaragenTor garagenTor) {
        this.garagenTor = garagenTor;
    }

    @Override
    public void ausfuehren() {
        garagenTor.runter();
    }

    @Override
    public void rueckgaengig() {
        garagenTor.hoch();
    }
}
