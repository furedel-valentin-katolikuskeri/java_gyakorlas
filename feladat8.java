package com.company;

import java.util.Scanner;

public class feladat8 {

    public static void main(String[] args) {
        //Írj programot, mely beolvas két pozitív egész számot, és kiírja a számtani és mértani
        //közepüket! A gyökvonáshoz használd a Math.Sqrt() függvényt!
        Scanner konzol= new Scanner(System.in);
        System.out.println("kérem az első egész számot:");
        int szam1= konzol.nextInt();
        System.out.println("Kérem a második egész számot:");
        int szam2= konzol.nextInt();
        int szamtani=(szam1+szam2)/2;
        double mertani=Math.sqrt(szam1*szam2);
        System.out.println("A két szám számtani közepe:" + szamtani);
        System.out.printf("A két szám mértani közepe: %.2f" , mertani);
    }
}
