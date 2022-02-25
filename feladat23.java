package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Írj programot, amely beolvas egy pozitív egész számot, és kiírja az egész számokat
        //a képernyőre eddig a számig, egymástól szóközzel elválasztva!
        Scanner konzol= new Scanner(System.in);
        System.out.println("Kérek egy pozitív egész számot:");
        int szam=konzol.nextInt();
        int szamlalo=0;
        while(szamlalo!=szam){
            System.out.printf("%d ",szamlalo++);
        }
    }
}
