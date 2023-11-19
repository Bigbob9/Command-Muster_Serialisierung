package org.example;

public class LichtAnBefehl implements Befehl {

    Licht licht;

    public LichtAnBefehl(Licht licht){
        this.licht = licht;
    }

    public void ausfuehren(){
        licht.ein();
    }
}
