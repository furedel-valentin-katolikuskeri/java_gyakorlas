package com.company;

import java.util.Scanner;

public class feladat24 {
    public static void main(String[] args) {
        Scanner konzol= new Scanner(System.in);
        System.out.println("Kérek egy pozitív egész számot:");
        int szam=konzol.nextInt();
        int szamlalo=0;
        while(szamlalo!=szam) {
            System.out.printf("%d\n", szamlalo++);
        }
    }
}
