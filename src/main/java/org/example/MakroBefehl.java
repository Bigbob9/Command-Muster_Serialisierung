package org.example;

public class MakroBefehl implements Befehl{

    Befehl[] befehl;

    public MakroBefehl(Befehl[] befehl){
    this.befehl = befehl;
    }

    public void ausfuehren(){
        for (int i = 0; i < befehl.length; i++){
            befehl[i].ausfuehren();
        }
    }

    public void rueckgaengig(){
        for (int i = 0; i < befehl.length; i++){
            befehl[i].rueckgaengig();
        }

    }
}
