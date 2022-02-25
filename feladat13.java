package com.company;

import java.util.Scanner;

public class feladat13 {

    public static void main(String[] args) {
        //Írj programot, mely beolvassa egy kör átmérőjét, és kiírja a kör kerületét és területét!
        //A pi értékének meghatározásához használd a Math.PI értéket!

        Scanner konzol=new Scanner(System.in);
        System.out.println("Kérem a kör átmérőjét:");
        int atmero=konzol.nextInt();
        double kerulet= 2*atmero*Math.PI;
        double terulet= Math.pow(atmero,2)*Math.PI;
        System.out.printf("A kör kerülete: %.2f\n",kerulet);
        System.out.printf("A kör területe: %.2f",terulet);
    }
}
