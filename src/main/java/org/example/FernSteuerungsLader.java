package org.example;


public class FernSteuerungsLader {
    public static void main(String[] args) {
        FernSteuerungMitRueckgaengig fernSteuerungMitRueckgaengig = new FernSteuerungMitRueckgaengig();

        Licht licht = new Licht("Wohnzimmer: ");
        Fernseher fernseher = new Fernseher("Wohnzimmer: ");
        StereoAnlage stereo = new StereoAnlage("Wohnzimmer: ");
        Whirlpool whirlpool = new Whirlpool();

        LichtAnBefehl lichtAnBefehl = new LichtAnBefehl(licht);
        LichtAusBefehl lichtAusBefehl = new LichtAusBefehl(licht);
        FernseherAnBefehl fernseherAnBefehl = new FernseherAnBefehl(fernseher);
        FernseherAusBefehl fernseherAusBefehl = new FernseherAusBefehl(fernseher);
        StereoAnlageAnBefehl stereoAnlageAnBefehl = new StereoAnlageAnBefehl(stereo);
        StereoAnlageAusBefehl stereoAnlageAusBefehl = new StereoAnlageAusBefehl(stereo);
        WhirlpoolAnBefehl whirlpoolAnBefehl = new WhirlpoolAnBefehl(whirlpool);
        WhirlpoolAusBefehl whirlpoolAusBefehl = new WhirlpoolAusBefehl(whirlpool);

        Befehl[] anBefehle = new Befehl[]{ lichtAnBefehl, fernseherAnBefehl, stereoAnlageAnBefehl, whirlpoolAnBefehl};
        Befehl[] ausBefehle = new Befehl[]{ lichtAusBefehl, fernseherAusBefehl, stereoAnlageAusBefehl, whirlpoolAusBefehl};

        MakroBefehl makroAnBefehl = new MakroBefehl(anBefehle);
        MakroBefehl makroAusBefehl = new MakroBefehl(ausBefehle);

        fernSteuerungMitRueckgaengig.setBefehl(0, makroAnBefehl, makroAusBefehl);

        System.out.println(fernSteuerungMitRueckgaengig);

        fernSteuerungMitRueckgaengig.anKnopfWurdeGedrueckt(0);
        fernSteuerungMitRueckgaengig.ausKnopfWurdeGedrueckt(0);

        System.out.println(fernSteuerungMitRueckgaengig);

        fernSteuerungMitRueckgaengig.rueckgaengigKnopfWurdeGedrueckt();

        System.out.println(fernSteuerungMitRueckgaengig);






    }
}