package com.company;

import java.util.Scanner;

public class feladat18 {

    public static void main(String[] args) {
        //Írjunk programot, amely bekéri két pont koordinátáit, majd kiszámolja azok távolságát.
        Scanner konzol=new Scanner(System.in);
        System.out.println("Kérem az 'x1' koordinátát:");
        int x1= konzol.nextInt();
        System.out.println("Kérem az 'x2' koordinátát:");
        int x2= konzol.nextInt();
        System.out.println("Kérem az 'y1' koordinátát:");
        int y1= konzol.nextInt();
        System.out.println("Kérem az 'y2' koordinátát:");
        int y2= konzol.nextInt();
        double tavolsag=Math.sqrt((x1-x2)*(x1-x2)+(y2-y1)*(y2-y1));
        System.out.printf("%.2f",tavolsag);
    }
}
