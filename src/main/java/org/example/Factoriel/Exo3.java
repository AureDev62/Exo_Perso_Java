package org.example.Factoriel;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre");

        int a = scanner.nextInt();

        int result = factorial(a);

        System.out.println("La factorielle de " + a + " est " + result);
    }

    public static int factorial(int a){
        if (a<0){
            System.out.println("Impossible de calculer le factoriel d'un nombre négatif");
            return -1;
        }else if(a == 0) {
            return 1;
        }else{
            return a*factorial(a-1);
        }
    }
}
