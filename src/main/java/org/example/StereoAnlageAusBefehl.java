package org.example;

public class StereoAnlageAusBefehl implements Befehl{

    StereoAnlage stereoAnlage;
    public StereoAnlageAusBefehl(StereoAnlage stereoAnlage) {
        this.stereoAnlage = stereoAnlage;
    }

    @Override
    public void ausfuehren() {
        stereoAnlage.aus();
    }

    @Override
    public void rueckgaengig() {
        stereoAnlage.ein();
        stereoAnlage.setCD();
        stereoAnlage.setLautstaerke(10);
    }
}
