package com.company;

import java.util.Scanner;

public class feladat25 {

    public static void main(String[] args) {
        //Írj programot, amely beolvas egy pozitív egész számot, és kiírja az osztóit!

        Scanner konzol=new Scanner(System.in);
        System.out.println("Kérek egy pozitív egész számot:");
        String bekeres= konzol.nextLine();
        int szam=Integer.parseInt(bekeres);
        while(szam<=0){
            System.out.println("Kérem csak pozitív egész számot adjon meg!");
            bekeres= konzol.nextLine();
            szam=Integer.parseInt(bekeres);
        }
        for (int i = 1;i <= szam; i++){
            if(szam % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
