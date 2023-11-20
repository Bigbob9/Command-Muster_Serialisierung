package org.example;

public class FernSteuerungMitRueckgaengig {
    Befehl[] anBefehle;
    Befehl[] ausBefehle;
    Befehl rueckgaengigBefehl;

    public FernSteuerungMitRueckgaengig(){
        anBefehle = new Befehl[7];
        ausBefehle = new Befehl[7];

    for (int i = 0; i < 7; i++){
        anBefehle[i] = new keinBefehl();
        ausBefehle[i] = new keinBefehl();
     }
     rueckgaengigBefehl = new keinBefehl();
    }

    public void setBefehl(int platz, Befehl anBefehl, Befehl ausBefehl){
        anBefehle[platz] = anBefehl;
        ausBefehle[platz] = ausBefehl;

    }
    public void anKnopfWurdeGedrueckt(int platz){
        anBefehle[platz].ausfuehren();
        rueckgaengigBefehl = anBefehle[platz];
    }
    public void ausKnopfWurdeGedrueckt(int platz){
        ausBefehle[platz].ausfuehren();
        rueckgaengigBefehl = ausBefehle[platz];
    }

    public void rueckgaengigKnopfWurdeGedrueckt(){
        rueckgaengigBefehl.rueckgaengig();
    }
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Fernsteuerung ------\n");
        for(int i = 0; i < anBefehle.length; i++){
            stringBuff.append("[P " + i + "] " + anBefehle[i].getClass().getName() + "            " + ausBefehle[i].getClass().getName() + "\n");
        }
        stringBuff.append("[ Rückgängig ] " + rueckgaengigBefehl.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
