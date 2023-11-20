package org.example;


public class FernSteuerungsLader {
    public static void main(String[] args) {
        FernSteuerungMitRueckgaengig fernSteuerungMitRueckgaengig = new FernSteuerungMitRueckgaengig();


        Licht wohnzimmerBeleuchtung = new Licht("Wohnzimmer:");

        LichtAnBefehl wohnzimmerBeleuchtungAn = new LichtAnBefehl(wohnzimmerBeleuchtung);
        LichtAusBefehl wohnzimmerBeleuchtungAus = new LichtAusBefehl(wohnzimmerBeleuchtung);




        fernSteuerungMitRueckgaengig.setBefehl(0, wohnzimmerBeleuchtungAn, wohnzimmerBeleuchtungAus);




        fernSteuerungMitRueckgaengig.anKnopfWurdeGedrueckt(0);
        fernSteuerungMitRueckgaengig.ausKnopfWurdeGedrueckt(0);
        System.out.println(fernSteuerungMitRueckgaengig);

        fernSteuerungMitRueckgaengig.rueckgaengigKnopfWurdeGedrueckt();

        fernSteuerungMitRueckgaengig.ausKnopfWurdeGedrueckt(0);
        fernSteuerungMitRueckgaengig.anKnopfWurdeGedrueckt(0);
        System.out.println(fernSteuerungMitRueckgaengig);

        fernSteuerungMitRueckgaengig.rueckgaengigKnopfWurdeGedrueckt();






    }
}