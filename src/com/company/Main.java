package com.company;

import java.io.FileNotFoundException;
import java.util.LinkedList;

import static com.company.Zentrale.zeilenbreite;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MyFile my_fart = new MyFile("C:\\Users\\paulf\\IdeaProjects\\test_11\\src\\com\\company\\text.txt");
        LinkedList<String> ma_merde = my_fart.get_file();
        zeilenbreite(ma_merde, 100);
    }
}
