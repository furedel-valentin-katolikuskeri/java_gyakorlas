package com.company;

import java.util.Scanner;

public class feladat26 {

    public static void main(String[] args) {
        //Írj programot, amely beolvas egy pozitív egész számot, és kiírja az osztóinak az
        //összegét!

        Scanner konzol=new Scanner(System.in);
        System.out.println("Kérek egy pozitív egész számot:");
        String bekeres= konzol.nextLine();
        int szam=Integer.parseInt(bekeres);
        int osszeg=0;
        while(szam<=0){
            System.out.println("Kérem csak pozitív egész számot adjon meg!");
            bekeres= konzol.nextLine();
            szam=Integer.parseInt(bekeres);
        }
        for (int i = 1;i <= szam; i++){
            if(szam % i == 0){
                osszeg=osszeg + i;
            }
        }
        System.out.println(osszeg);
    }
}

