package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Írj egy programot, amely beolvassa a felhasználó nevét, majd köszön neki!
        Scanner konzol= new Scanner(System.in);
        System.out.println("Kérem a felhasználó neved:");
        String nev= konzol.nextLine();
        System.out.println("Üdvözlöm " + nev + "!");
    }
}
