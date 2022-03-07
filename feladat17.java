package com.company;

import java.util.Scanner;

public class feladat17 {

    public static void main(String[] args) {
	// Írjunk programot, mely a testsúly és a testmagasság alapján meghatározza a
        //testtömegindexet, és kiírja, hogy milyen testsúly osztályba tartozik az adott illető. a
        //testtömeg osztályokat meghatározhatjuk tetszőlegesen, de alapul vehetünk létező
        //osztályozásokat is.

        Scanner konzol= new Scanner(System.in);
        System.out.println("Kérem a testsúlyt:");
        int testsuly= konzol.nextInt();
        System.out.println("Kérem a testmagasságot:");
        int testmagassag= konzol.nextInt();
        double testtomegindex= testsuly / Math.pow(testmagassag,2) * 10000;

        if (testtomegindex <=16){
            System.out.println("Súlyosan sovány osztályba tartozol!");
        }
        else if (testtomegindex >= 16 && testtomegindex <= 16.99){
            System.out.println("Mérsékelten sovány osztályba tartozol!");
        }
        else if (testtomegindex >= 17 && testtomegindex <= 18.49){
            System.out.println("Enyhe sovány osztályba tartozol!");
        }
        else if (testtomegindex >= 18.5 && testtomegindex <= 24.99){
            System.out.println("Normál testsúlyú osztályba tartozol!");
        }
        else if (testtomegindex >= 25 && testtomegindex <= 29.99){
            System.out.println("Túlsúlyos osztályba tartozol!");
        }
        else if (testtomegindex >= 30 && testtomegindex <= 34.99){
            System.out.println("I.fokú elhízás osztályba tartozol!");
        }
        else if (testtomegindex >=35 && testtomegindex <= 39.99){
            System.out.println("II.fokú elhízás osztályba tartozol!");
        }
        else if (testtomegindex >= 40){
            System.out.println("III.fokú (súlyos) elhízás osztályba tartozol!");
        }
        else{
            System.out.println("Nem kiszámítható a testtömeg indexed!");
        }



    }
}
