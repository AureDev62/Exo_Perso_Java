package org.example.Suite_Fibonaci;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien de termes de la suite de Fibonacci voulez-vous générer ?");

        int a = scanner.nextInt();

        int t1=0,t2=1;

        System.out.print("Les " + a + " premiers termes de la suite de Fibonacci : ");

        for (int i= 1; i<=a;++i){
            System.out.println(t1 +",");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }
    }
}
