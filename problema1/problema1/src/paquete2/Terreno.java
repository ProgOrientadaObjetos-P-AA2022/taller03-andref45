/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author andreflores
 */
public class Terreno {

    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecer_ancho(double a) {
        ancho = a;
    }

    public void establecer_largo(double a) {
        largo = a;
    }

    public void establecer_valorMetroCuadrado(double a) {
        valorMetroCuadrado = a;
    }

    public void calcular_area() {
        area = ancho * largo;
    }

    public void calcular_costoTerreno() {
        costoTerreno = valorMetroCuadrado * area;
    }

    public double obtener_ancho() {
        return ancho;
    }

    public double obtener_largo() {
        return largo;
    }

    public double obtener_valorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtener_area() {
        return area;
    }

    public double obtener_costoTerreno() {
        return costoTerreno;
    }
}
