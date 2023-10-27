package org.example.Temperature;

import java.util.Scanner;

public class Exo5 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre valeur de température en Fahrenheit:");

        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit-32) *5/9;

        System.out.println("La température en celsius est de :" + celsius);

    }
}
