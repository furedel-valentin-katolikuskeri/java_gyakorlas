package com.company;

import java.util.Scanner;

public class feladat3 {

    public static void main(String[] args) {
        //Írj programot, ami beolvas egy számot, majd kiírja a kétszeresét!
            Scanner konzol = new Scanner(System.in);
            System.out.println("Kérek egy számot:");
            int szam= konzol.nextInt();
            System.out.println(szam*2);
    }
}
