package org.example.Moyenne;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre de 3");
        int n = scanner.nextInt();

        double[] notes = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Entrez la note " + (i+1) + " :");
            notes[i] = scanner.nextDouble();
        }

        double somme = 0;
        for (int i = 0; i < n; i++) {
            somme += notes[i];
        }

        double moyenne = somme / n;


        System.out.println("La moyenne est : " + moyenne);
    }
}
