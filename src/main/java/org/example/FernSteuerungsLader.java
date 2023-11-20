package org.example;


public class FernSteuerungsLader {
    public static void main(String[] args) {
        FernSteuerungMitRueckgaengig fernSteuerungMitRueckgaengig = new FernSteuerungMitRueckgaengig();

        Ventilator ventilator = new Ventilator("Wohnzimmer: ");

        VentilatorMittelBefehl  ventilatorMittelBefehl = new VentilatorMittelBefehl(ventilator);
        VentilatorSchnellBefehl ventilatorSchnellBefehl = new VentilatorSchnellBefehl(ventilator);
        VentilatorAusBefehl ventilatorAusBefehl = new VentilatorAusBefehl(ventilator);





        fernSteuerungMitRueckgaengig.setBefehl(0, ventilatorMittelBefehl, ventilatorAusBefehl);
        fernSteuerungMitRueckgaengig.setBefehl(1, ventilatorSchnellBefehl,ventilatorAusBefehl);


        fernSteuerungMitRueckgaengig.anKnopfWurdeGedrueckt(0);
        fernSteuerungMitRueckgaengig.ausKnopfWurdeGedrueckt(0);
        System.out.println(fernSteuerungMitRueckgaengig);
        fernSteuerungMitRueckgaengig.rueckgaengigKnopfWurdeGedrueckt();

        fernSteuerungMitRueckgaengig.anKnopfWurdeGedrueckt(1);

        System.out.println(fernSteuerungMitRueckgaengig);

        fernSteuerungMitRueckgaengig.rueckgaengigKnopfWurdeGedrueckt();






    }
}