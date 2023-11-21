package org.example;

public class StereoAnlageAnBefehl implements Befehl{

    StereoAnlage stereo;
    public StereoAnlageAnBefehl(StereoAnlage stereo) {
        this.stereo = stereo;
    }

    @Override
    public void ausfuehren() {
        stereo.ein();
    }

    @Override
    public void rueckgaengig() {
        stereo.aus();
    }
}
