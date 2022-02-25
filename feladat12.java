package com.company;

import java.util.Scanner;

public class feladat12 {

    public static void main(String[] args) {
        //Írj programot, mely beolvassa a téglatest három élének hosszát, és kiírja a
        //felszínének és térfogatának mérőszámát!

        Scanner konzol = new Scanner(System.in);
        System.out.println("Kérem az 'a' oldal hosszát:");
        int a = konzol.nextInt();
        System.out.println("Kérem a 'b' oldal hosszát:");
        int b = konzol.nextInt();
        System.out.println("Kérem a 'c' oldal hosszát:");
        int c = konzol.nextInt();
        int terfogat= a*b*c;
        int felszin=2*(a*b+a*c+b*c);
        System.out.println("A téglatest felszíne:" + felszin);
        System.out.println("A téglatest térfogata:" + terfogat);
    }
}
