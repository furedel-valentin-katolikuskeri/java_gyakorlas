package com.company;

import java.util.Scanner;

public class feladat4 {

    public static void main(String[] args) {
        //Írj programot, ami beolvas két számot, majd kiírja:
        //a. az összegüket;
        //b. különbségüket;
        //c. szorzatukat;
        //d. hányadosukat, ha lehet!
        Scanner konzol= new Scanner(System.in);
        System.out.println("Kérem az első számot:");
        int szam1= konzol.nextInt();
        System.out.println("Kérem a második számot:");
        int szam2= konzol.nextInt();
        int osszeg=szam1+szam2;
        int kulonbseg=szam1-szam2;
        int szorzat=szam1*szam2;
        int hanyados=szam1/szam2;
        System.out.println("Az összegük:" + osszeg);
        System.out.println("A különbségük:" + kulonbseg);
        System.out.println("A szorzatuk:" + szorzat);
        System.out.println("A hányadosuk:" + hanyados);
    }
}
