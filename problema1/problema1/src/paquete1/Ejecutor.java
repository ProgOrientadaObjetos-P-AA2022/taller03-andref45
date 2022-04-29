package paquete1;

import paquete2.Terreno;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) {
        Terreno obj = new Terreno();
        
        double ancho = 70;
        double largo = 150;
        double valorMetroCuadrado = 5.75;

        obj.establecer_ancho(ancho);
        obj.establecer_largo(largo);
        obj.establecer_valorMetroCuadrado(valorMetroCuadrado);

        obj.calcular_area();
        obj.calcular_costoTerreno();

        System.out.printf("Datos del terreno\nAncho: %.2f\n"
                + "Largo: %.2f\nValor del metro cuadrado: %.2f\n"
                + "Área: %.2f\nCosto total: %.2f\n\n",
                obj.obtener_ancho(), obj.obtener_largo(),
                obj.obtener_valorMetroCuadrado(), obj.obtener_area(),
                obj.obtener_costoTerreno());
        
        Terreno obj2 = new Terreno();

        double ancho2 = 20;
        double largo2 = 300;
        double valorMetroCuadrado2 = 3.25;

        obj2.establecer_ancho(ancho2);
        obj2.establecer_largo(largo2);
        obj2.establecer_valorMetroCuadrado(valorMetroCuadrado2);

        obj2.calcular_area();
        obj2.calcular_costoTerreno();

        System.out.printf("Datos del terreno 2\nAncho: %.2f\n"
                + "Largo: %.2f\nValor del metro cuadrado: %.2f\n"
                + "Área: %.2f\nCosto total: %.2f\n",
                obj2.obtener_ancho(), obj2.obtener_largo(),
                obj2.obtener_valorMetroCuadrado(), obj2.obtener_area(),
                obj2.obtener_costoTerreno());
    }
}
