package com.company;

import java.util.LinkedList;

public class Zentrale {
    public static /*LinkedList<String>*/ void zeilenbreite(LinkedList<String> einiliste, int eini) {
        int buchstaben_netto = 0;
        int buchstaben_brutto = 0;
        LinkedList<String> diese_zeile = new LinkedList<>();
        for (int i = 0; i < einiliste.size(); i++) {
            if (buchstaben_brutto + einiliste.get(i).length() > eini) {
                int zu_verteilen = eini - buchstaben_netto;
                int kleinere_Zahl = zu_verteilen / (diese_zeile.size() - 1);
                int bonusleerzeichen = zu_verteilen - (kleinere_Zahl * (diese_zeile.size() - 1));
                String leerzeichen = "";
                for (int j = 0; j < kleinere_Zahl; j++) {
                    leerzeichen += " ";
                }
                String zeile_zum_Ausdrucken = "";
                for (int j = 0; j < diese_zeile.size(); j++) {
                    zeile_zum_Ausdrucken += diese_zeile.get(j);
                    if (j < bonusleerzeichen) {
                        zeile_zum_Ausdrucken += " " + leerzeichen;
                    } else {
                        zeile_zum_Ausdrucken += leerzeichen;
                    }
                }
                diese_zeile.clear();
                System.out.println(zeile_zum_Ausdrucken);
                buchstaben_brutto = 0;
                buchstaben_netto = 0;
            }
            buchstaben_brutto++;
            buchstaben_brutto += einiliste.get(i).length();
            buchstaben_netto += einiliste.get(i).length();
            diese_zeile.add(einiliste.get(i));
        }
        for (int i = 0; i < diese_zeile.size(); i++) {
            System.out.print(diese_zeile.get(i) + " ");
        }

    }
}