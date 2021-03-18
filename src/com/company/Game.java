package com.company;

import java.awt.*;

public class Game {
    int summe;
    int gewinn;

    public Game() {
        this.summe = 0;
        this.gewinn = 0;
    }
    int auswerfen(int eini){
        for (int i = 0; i < eini; i++) {
            gewinn = (int)(Math.random() * 6);
            if (gewinn == 0){
                return 0;
            } else {
                summe += gewinn + 1;
            }
        }
        return summe;
    }
}
