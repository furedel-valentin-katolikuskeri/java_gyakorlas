package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Írj programot, ami beolvassa a másodfokú egyenlet együtthatóit, és kiírja az egyenlet
        //megoldásait, ha vannak!
        Scanner konzol= new Scanner(System.in);
        System.out.println("kérem az első együtthatót:");
        int szam1= konzol.nextInt();
        System.out.println("Kérem a második együtthatót:");
        int szam2= konzol.nextInt();
        System.out.println("Kérem a harmadik együtthatót:");
        int szam3= konzol.nextInt();
        double gyokvonas1=(-szam2-Math.sqrt(Math.pow(szam2,2)-4*szam1*szam3))/2*szam1;
        double gyokvonas2=(-szam2+Math.sqrt(Math.pow(szam2,2)-4*szam1*szam3))/2*szam1;
        double megoldas=gyokvonas1+gyokvonas2;
        System.out.println();
    }
}
