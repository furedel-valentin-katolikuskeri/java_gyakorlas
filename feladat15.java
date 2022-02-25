package com.company;

import java.util.Scanner;

public class feladat15 {

    public static void main(String[] args) {
        //Írjunk programot, mely bekér egy számot, és eldönti, hogy osztható-e 3-mal, 4-gyel
        //vagy 9-cel.
        Scanner konzol=new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int szam=konzol.nextInt();
        if(szam%3==0 && szam%9==0){
            System.out.println("A számod osztható 3-mal is meg 9-cel is!");
        }
        else if(szam%4==0){
            System.out.println("A számod oszható 4-gyel!");
        }
        else{
            System.out.println("A számod egyikkel sem osztható!");
        }
    }
}
