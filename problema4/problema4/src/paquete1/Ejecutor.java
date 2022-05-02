/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.EquiposCelulares;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EquiposCelulares ec1 = new EquiposCelulares();
        String s_o;
        String t_p;
        double c_ini;
        double iva;
        double iva_cIni;
        double c_final;
        String dir_mac;
        String inf_IMEI;

        System.out.println("Escriba el sistema operativo: ");
        s_o = entrada.nextLine();

        System.out.println("Escriba el tamaño de la pantalla: ");
        t_p = entrada.nextLine();

        System.out.println("Escriba el costo inicial: ");
        c_ini = entrada.nextDouble();

        System.out.println("Escriba el porcentaje del iva: ");
        iva = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Escriba la dirección mac: ");
        dir_mac = entrada.nextLine();

        System.out.println("Escriba la información IMEI: ");
        inf_IMEI = entrada.nextLine();

        ec1.establecerS_O(s_o);
        ec1.establecerT_P(t_p);
        ec1.establecerC_ini(c_ini);
        ec1.establecerIva(iva);
        ec1.calcularIva_cIni();
        ec1.calcularC_final();
        ec1.establecerDir_Mac(dir_mac);
        ec1.establecerInfIMEI(inf_IMEI);
        System.out.println();
        System.out.printf("Datos del dispositivo:\nSistema operativo: %s\n"
                + "Tamaño de la pantalla: %s\nCosto inicial: %.2f\nIva: %.2f%%\n"
                + "Iva del costo inicial: %.2f\nCosto Final: %.2f\n"
                + "Dirección mac: %s\nInformación IMEI: %s\n\n",
                ec1.obtenerS_O(), ec1.obtenerT_P(), ec1.obtenerC_ini(),
                ec1.obtenerIva(), ec1.obtenerIva_cIni(), ec1.obtenerC_final(),
                ec1.obtenerDir_Mac(), ec1.obtenerInfIMEI());

        EquiposCelulares ec2 = new EquiposCelulares();

        System.out.println("Escriba el sistema operativo: ");
        s_o = entrada.nextLine();

        System.out.println("Escriba el tamaño de la pantalla: ");
        t_p = entrada.nextLine();

        System.out.println("Escriba el costo inicial: ");
        c_ini = entrada.nextDouble();

        System.out.println("Escriba el porcentaje del iva: ");
        iva = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Escriba la dirección mac: ");
        dir_mac = entrada.nextLine();

        System.out.println("Escriba la información IMEI: ");
        inf_IMEI = entrada.nextLine();

        ec2.establecerS_O(s_o);
        ec2.establecerT_P(t_p);
        ec2.establecerC_ini(c_ini);
        ec2.establecerIva(iva);
        ec2.calcularIva_cIni();
        ec2.calcularC_final();
        ec2.establecerDir_Mac(dir_mac);
        ec2.establecerInfIMEI(inf_IMEI);
        System.out.println();
        System.out.printf("Datos del dispositivo:\nSistema operativo: %s\n"
                + "Tamaño de la pantalla: %s\nCosto inicial: %.2f\nIva: %.2f%%\n"
                + "Iva del costo inicial: %.2f\nCosto Final: %.2f\n"
                + "Dirección mac: %s\nInformación IMEI: %s\n",
                ec2.obtenerS_O(), ec2.obtenerT_P(), ec2.obtenerC_ini(),
                ec2.obtenerIva(), ec2.obtenerIva_cIni(), ec2.obtenerC_final(),
                ec2.obtenerDir_Mac(), ec2.obtenerInfIMEI());
    }

}
