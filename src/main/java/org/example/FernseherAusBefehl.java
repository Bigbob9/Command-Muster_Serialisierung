package org.example;

public class FernseherAusBefehl implements Befehl{

    Fernseher fernseher;
    public FernseherAusBefehl(Fernseher fernseher) {
        this.fernseher = fernseher;
    }

    @Override
    public void ausfuehren() {
        fernseher.aus();
    }

    @Override
    public void rueckgaengig() {
        fernseher.ein();
    }
}
