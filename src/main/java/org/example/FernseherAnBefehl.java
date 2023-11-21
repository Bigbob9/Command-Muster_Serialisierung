package org.example;

public class FernseherAnBefehl implements Befehl{

    Fernseher fernseher;

    public FernseherAnBefehl(Fernseher fernseher){
    this.fernseher = fernseher;
    }

    public void ausfuehren(){
        fernseher.ein();
    }

    public void rueckgaengig(){
        fernseher.aus();
    }
}
