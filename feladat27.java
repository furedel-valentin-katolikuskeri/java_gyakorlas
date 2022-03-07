package com.company;

import java.util.Scanner;

public class feladat27 {

    public static void main(String[] args) {

        //Írj programot, amely beolvas egy pozitív egész számot, és megmondja, hogy
        //tökéletes szám-e! (A tökéletes számok azok, melyek osztóinak összege egyenlő a
        //szám kétszeresével. Ilyen szám pl. a 6, mert 2*6 = 1 + 2 + 3 + 6.)
        Scanner konzol= new Scanner(System.in);
        System.out.println("Kérek egy pozitív egész számot:");
        int szam= konzol.nextInt();
        int oszto = 0;
        for(int i = 1; i  < szam;  i++ ){
            if( szam % i == 0 ){
                oszto += i;
            }
        }
        if( szam == oszto ){
            System.out.println("A te számod tökéletes!");
        }
        else{
            System.out.println("A te számod tökéletlen!");
        }

    }
}
