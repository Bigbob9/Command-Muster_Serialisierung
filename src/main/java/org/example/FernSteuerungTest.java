package org.example;



public class FernSteuerungTest{
    public static void main(String[] args){
        FernSteuerung fernsteuerung = new FernSteuerung();
        Licht lichtanmachen = new Licht();
        LichtAnBefehl lichtEin = new LichtAnBefehl(lichtanmachen);

        Licht lichtausmachen = new Licht();
        LichtAusBefehl lichtAus = new LichtAusBefehl(lichtausmachen);

        GaragenTor garagenTor = new GaragenTor();
        GaragenTorOeffnenBefehl garagenTorOeffnenBefehl = new GaragenTorOeffnenBefehl(garagenTor);

        fernsteuerung.setBefehl(1, garagenTorOeffnenBefehl, garagenTorOeffnenBefehl);
        fernsteuerung.setBefehl(0,lichtEin, lichtAus);

        System.out.println(fernsteuerung);
        System.out.println(fernsteuerung.getClass().getName());
        fernsteuerung.anKnopfWurdeGedrueckt(0);
        fernsteuerung.ausKnopfWurdeGedrueckt(0);
        fernsteuerung.anKnopfWurdeGedrueckt(1);

    }
}