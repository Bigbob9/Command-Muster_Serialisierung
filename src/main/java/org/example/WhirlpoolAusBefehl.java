package org.example;

public class WhirlpoolAusBefehl implements Befehl{

    Whirlpool whirlpool;
    public WhirlpoolAusBefehl(Whirlpool whirlpool) {
        this.whirlpool = whirlpool;
    }

    @Override
    public void ausfuehren() {
        whirlpool.strahlerAus();
        whirlpool.setTemperatur("0");
    }

    @Override
    public void rueckgaengig() {
        whirlpool.strahlerEin();
        whirlpool.setTemperatur("35");
        whirlpool.zirkulieren();
    }
}
