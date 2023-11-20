package org.example;

public class StereoAnlageAnMitCD implements Befehl{

    StereoAnlage stereoAnlage;

    public StereoAnlageAnMitCD(StereoAnlage stereoAnlage){
        this.stereoAnlage = stereoAnlage;
    }

    public void ausfuehren(){
        stereoAnlage.ein();
        stereoAnlage.setCD();
        stereoAnlage.setLautstaerke(16);
    }

    @Override
    public void rueckgaengig() {
        stereoAnlage.aus();
    }
}
