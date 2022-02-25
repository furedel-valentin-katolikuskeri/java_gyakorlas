package com.company;

import java.util.Scanner;

public class feladat6 {

    public static void main(String[] args) {
        //Írj programot, mely beolvas három egész számot, és kiírja a képernyőre a
        //legkisebbet!
            Scanner konzol= new Scanner(System.in);
            System.out.println("kérem az első egész számot:");
            int szam1= konzol.nextInt();
            System.out.println("Kérem a második egész számot:");
            int szam2= konzol.nextInt();
            System.out.println("Kérem a harmadik egész számot:");
            int szam3= konzol.nextInt();
            if(szam1>szam2){
                System.out.println(szam1);
            }
            else if(szam2>szam3){
                System.out.println(szam2);
            }
            else{
                System.out.println(szam3);
            }
    }
}
