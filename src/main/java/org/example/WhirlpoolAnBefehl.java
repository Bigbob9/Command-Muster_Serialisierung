package org.example;

public class WhirlpoolAnBefehl implements Befehl{

    Whirlpool whirlpool;


    public WhirlpoolAnBefehl(Whirlpool whirlpool) {
    this.whirlpool = whirlpool;
    }

    @Override
    public void ausfuehren() {
        whirlpool.strahlerEin();
        whirlpool.setTemperatur("35");
        whirlpool.zirkulieren();
    }

    @Override
    public void rueckgaengig() {
        whirlpool.strahlerAus();
        whirlpool.setTemperatur("0");
    }
}
