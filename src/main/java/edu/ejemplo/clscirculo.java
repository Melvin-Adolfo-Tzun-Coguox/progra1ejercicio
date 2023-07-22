package edu.ejemplo;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class clscirculo {
    public void circulo(double r){
        double areacirculo = Math.PI*Math.pow(r,2);

        System.out.println("El area del circulo es "+areacirculo);
    }

    public void circunferencia(double r1) {
        double Ccirculo=2 * Math.PI *r1;
        System.out.println("La circunferencia del circulo es "+Ccirculo);
    }
    public void volumen(double s){
        double volumenc=Math.pow(s,3);
        System.out.println("El volumen del cubo es "+volumenc);

    }
    public void piramide(double h,double b){
        double areapiramide=h*b;
        System.out.println("El area de la piramide es: "+areapiramide);

    }
}
