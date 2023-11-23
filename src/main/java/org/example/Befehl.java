package org.example;

public interface Befehl {

    Speicher speicher = Speicher.getInstance();

    public void ausfuehren();
    public void rueckgaengig();

    public void speichern();

    public void laden();
}
