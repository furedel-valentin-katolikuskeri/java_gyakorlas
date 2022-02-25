package com.company;

import java.util.Scanner;

public class feladat5 {

    public static void main(String[] args) {
        //Írj programot, mely beolvas két egész számot, és kiírja a képernyőre a nagyobbikat!
            Scanner konzol= new Scanner(System.in);
            System.out.println("kérem az első egész számot:");
            int szam1= konzol.nextInt();
            System.out.println("Kérem a második egész számot:");
            int szam2= konzol.nextInt();
            if(szam1>szam2){
                System.out.println("Az első számod nagyobb!");
            }
            else{
                System.out.println("A második számod a nagyobb!");
            }
    }
}
