package org.example;


public class FernSteuerungsLader {
    public static void main(String[] args) {
        FernSteuerungMitRueckgaengig fernSteuerungMitRueckgaengig = new FernSteuerungMitRueckgaengig();

        Licht licht = new Licht("Wohnzimmer: ");


        LichtAnBefehl lichtAnBefehl = new LichtAnBefehl(licht);
        LichtAusBefehl lichtAusBefehl = new LichtAusBefehl(licht);


        fernSteuerungMitRueckgaengig.setBefehl(0, lichtAnBefehl, lichtAusBefehl);

        System.out.println(fernSteuerungMitRueckgaengig);

        fernSteuerungMitRueckgaengig.anKnopfWurdeGedrueckt(0);
        fernSteuerungMitRueckgaengig.ausKnopfWurdeGedrueckt(0);

        System.out.println(fernSteuerungMitRueckgaengig);

        fernSteuerungMitRueckgaengig.rueckgaengigKnopfWurdeGedrueckt();

        System.out.println(fernSteuerungMitRueckgaengig);

        Speicher.befehleLaden();







    }
}