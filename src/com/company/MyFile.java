package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class MyFile {
    String dateipfad;
    Scanner abtaster;
    FileReader aktenleser;
    public MyFile(String dateipfad) {
        this.dateipfad = dateipfad;
        try {
            this.aktenleser = new FileReader(dateipfad);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.abtaster = new Scanner(aktenleser);
    }
    public LinkedList<String> get_file() {
        LinkedList<String> aussi = new LinkedList<>();
        System.out.println("getting file");
        while (this.abtaster.hasNextLine()) {
            String wort = this.abtaster.next();
//            System.out.println("wort ist " + wort);
            aussi.add(wort);
        }
//        System.out.println("printing aussi from MyFile.get_file");
//        System.out.println(aussi);
//        System.out.println(aussi.getFirst());
        return aussi;
    }
}

