package paquete1;

import java.util.Scanner;
import paquete2.EquivalenteHora;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EquivalenteHora h_1 = new EquivalenteHora();
        double horas;
        double minutos;
        double segundos;
        double dias;

        System.out.println("(1)Escriba un número de horas: ");
        horas = entrada.nextDouble();

        h_1.establecerHoras(horas);
        h_1.calcularMinutos();
        h_1.calcularSegundos();
        h_1.calcularDias();
  
        System.out.printf("%.2f horas equivale:\n%.2f Minutos\n"
                + "%.2f Segundos\n%.2f Días\n\n", h_1.obtenerHoras(),
                h_1.obtenerMinutos(), h_1.obtenerSegundos(),
                h_1.obtenerDias());

        EquivalenteHora h_2 = new EquivalenteHora();

        System.out.println("(2)Escriba un número de horas: ");
        horas = entrada.nextDouble();

        h_2.establecerHoras(horas);
        h_2.calcularMinutos();
        h_2.calcularSegundos();
        h_2.calcularDias();

        System.out.printf("%.2f horas equivale:\n%.2f Minutos\n"
                + "%.2f Segundos\n%.2f Días\n", h_2.obtenerHoras(),
                h_2.obtenerMinutos(), h_2.obtenerSegundos(),
                h_2.obtenerDias());
    }
}
