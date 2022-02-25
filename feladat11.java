package com.company;

import java.util.Scanner;

public class feladat11 {

    public static void main(String[] args) {
        //Írj programot, mely beolvassa egy derékszögű háromszög két befogóját, és megadja
        //az átfogójának a hosszát! Az átfogót 2 tizedesjeggyel add meg!
        Scanner konzol=new Scanner(System.in);
        System.out.println("Kérem az első befogót:");
        int a=konzol.nextInt();
        System.out.println("Kérem a második befogót:");
        int b=konzol.nextInt();
        double atfogo= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("Az átfogó: %.2f" ,atfogo);
    }
}
