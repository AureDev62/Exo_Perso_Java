package org.example.Variable;

import java.util.Scanner;

public class Exo2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier Nombre");
        int a = scanner.nextInt();

        System.out.println("Entrez le deuxième nombre");
        int b = scanner.nextInt();

        int somme = a + b;
        System.out.println("La somme des nombre est de " + somme);

        int produit = a*b;
        System.out.println("Le produit des nombres est de " + produit);

        int soustraction = a-b;
        System.out.println("La différence des nombres est de " + soustraction);
    }
}
