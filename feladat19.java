package com.company;

import java.util.Scanner;

public class feladat19 {
    public static void main(String[] args) {
        //Írjon egy programot, ami leosztályoz egy maximálisan 100 pontos dolgozatot az 50,
        //65, 80, 90 ponthatárok szerint! A határérték a jobb jegyhez tartozik. Ha a pontszám
        //negatív vagy száznál nagyobb, akkor a program írja ki, hogy hibás az adat!
        Scanner konzol=new Scanner(System.in);
        System.out.println("Kérem a dolgozatban elért pontot:");
        int pont= konzol.nextInt();
        if (pont <= 49){
            System.out.println("A dolgozatod elégtelen!");
        }
        else if (pont >= 50 && pont <= 64){
            System.out.println("A dolgozatod elégséges!");
        }
        else if (pont >= 65 && pont <= 79){
            System.out.println("A dolgozatod közepes!");
        }
        else if (pont >= 80 && pont <= 89){
            System.out.println("A dolgozatod jó!");
        }
        else if (pont >= 90 && pont <= 100){
            System.out.println("A dolgozatod jeles!");
        }
        else{
            System.out.println("Nem tudom értelmezni a megadott pontszámot!");
        }
    }
}
