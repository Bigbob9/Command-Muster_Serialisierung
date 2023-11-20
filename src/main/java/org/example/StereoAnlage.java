package org.example;

public class StereoAnlage {
    String ort;
    public StereoAnlage(String ort){
        this.ort = ort;
    }
    public void ein() {
        System.out.println(ort + " StereoAnlage ist ein");
    }

    ;

    public void aus() {
        System.out.println(ort + " StereoAnlage ist aus");
    }

    ;

    public void setCD() {
        System.out.println(ort + " StereoAnlage spielt CD");
    }

    ;

    public void setDVD() {
    }

    ;

    public void setRadio() {
    }

    ;

    public void setLautstaerke(int i) {
        if (i > 15) {
            i = 15;
        } else if (i < 0) {
            i = 0;
        }
        System.out.println(ort + " Lautstärke ist auf " + i + " gesetzt.");
    }

    ;

}
