package org.ejemplo;
import edu.ejemplo.clscirculo;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio=scanner.nextDouble();
        clscirculo ej = new clscirculo();
        ej.circulo(radio);
        ej.circunferencia(radio);

        System.out.println("Ingrese el valor un lado del cubo");
        double volumen1=scanner.nextDouble();
        ej.volumen(volumen1);
        System.out.println("Ingrese la altura de la piramide ");
        double hpiramide=scanner.nextDouble();
        System.out.println("Ingrese la base de la piramide ");
        double bpiramide=scanner.nextDouble();

        ej.piramide(hpiramide,bpiramide);

    }
}