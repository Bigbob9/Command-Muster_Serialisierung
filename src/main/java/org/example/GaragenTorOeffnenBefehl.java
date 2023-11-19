package org.example;

public class GaragenTorOeffnenBefehl implements Befehl{

    GaragenTor garagenTor;

    public GaragenTorOeffnenBefehl(GaragenTor garagenTor){
        this.garagenTor = garagenTor;
    }


    public void ausfuehren(){
        garagenTor.hoch();
    }

}
