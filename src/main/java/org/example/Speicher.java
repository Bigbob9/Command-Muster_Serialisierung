package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Speicher implements Serializable {
    private static Speicher einzigeInstanz = new Speicher();



    static ArrayList<Befehl> befehleList;

    private Speicher(){
        befehleList = new ArrayList<>();
    }

    public static Speicher getInstance(){
        return einzigeInstanz;

        }



    public void befehleSpeichern(Befehl befehl){
        befehleList.add(befehl);

        try {
            FileOutputStream fosBefehl = new FileOutputStream("C:/Users/Belal/Desktop/JAVA/befehle.ser");
            ObjectOutputStream oosBefehl = new ObjectOutputStream(fosBefehl);

            oosBefehl.writeObject(this);
            oosBefehl.close();
        } catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void befehleLaden() {

        try {
            FileInputStream fisBefehl = new FileInputStream("C:/Users/Belal/Desktop/JAVA/befehle.ser");
            ObjectInputStream oisBefehl = new ObjectInputStream(fisBefehl);

            Speicher befehleLaden =  (Speicher) oisBefehl.readObject();
            befehleList = befehleLaden.befehleList;
            Iterator<Befehl> it = befehleList.iterator();
            while(it.hasNext()){
                Befehl befehl = it.next();
                befehl.laden();
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
