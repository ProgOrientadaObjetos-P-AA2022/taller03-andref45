/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.InstitucionesEducativas;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        InstitucionesEducativas i1 = new InstitucionesEducativas();
        String nombre;
        String t_ins;
        int n_alum;
        int n_doc;
        int n_sedes;
        double g_est;
        double presupuesto;

        System.out.println("Escriba el nombre de la institución: ");
        nombre = entrada.nextLine();

        System.out.println("Escriba el tipo de institución: ");
        t_ins = entrada.nextLine();

        System.out.println("Escriba el número de alumnos: ");
        n_alum = entrada.nextInt();

        System.out.println("Escriba el número de docentes: ");
        n_doc = entrada.nextInt();

        System.out.println("Escriba el número de sedes: ");
        n_sedes = entrada.nextInt();

        System.out.println("Escriba los gastos proyectados por estudiante: ");
        g_est = entrada.nextDouble();

        i1.establecerNombre(nombre);
        i1.establecerT_ins(t_ins);
        i1.establecerN_alum(n_alum);
        i1.establecerN_doc(n_doc);
        i1.establecerN_sedes(n_sedes);
        i1.establecerG_est(g_est);
        i1.calcularPresupuesto();
        System.out.println();

        System.out.printf("Datos de la institución:\nNombre: %s\nTipo de "
                + "institución: %s\nNúmero de alumnos: %d\nNúmero de docentes:"
                + " %d\nNúmero de sedes: %d\nGastos proyectados por estudiante:"
                + " %.2f\nPresupuesto: %.2f\n\n", i1.obtenerNombre(),
                i1.obtenerT_ins(), i1.obtenerN_alum(), i1.obtenerN_doc(),
                i1.obtenerN_sedes(), i1.obtenerG_est(),
                i1.obtenerPresupuesto());

        InstitucionesEducativas i2 = new InstitucionesEducativas();
        entrada.nextLine();
        System.out.println("Escriba el nombre de la institución: ");
        nombre = entrada.nextLine();

        System.out.println("Escriba el tipo de institución: ");
        t_ins = entrada.nextLine();

        System.out.println("Escriba el número de alumnos: ");
        n_alum = entrada.nextInt();

        System.out.println("Escriba el número de docentes: ");
        n_doc = entrada.nextInt();

        System.out.println("Escriba el número de sedes: ");
        n_sedes = entrada.nextInt();

        System.out.println("Escriba los gastos proyectados por estudiante: ");
        g_est = entrada.nextDouble();

        i2.establecerNombre(nombre);
        i2.establecerT_ins(t_ins);
        i2.establecerN_alum(n_alum);
        i2.establecerN_doc(n_doc);
        i2.establecerN_sedes(n_sedes);
        i2.establecerG_est(g_est);
        i2.calcularPresupuesto();

        System.out.printf("Datos de la institución:\nNombre: %s\nTipo de "
                + "institución: %s\nNúmero de alumnos: %d\nNúmero de docentes:"
                + " %d\nNúmero de sedes: %d\nGastos proyectados por estudiante:"
                + " %.2f\nPresupuesto: %.2f\n", i2.obtenerNombre(),
                i2.obtenerT_ins(), i2.obtenerN_alum(), i2.obtenerN_doc(),
                i2.obtenerN_sedes(), i2.obtenerG_est(),
                i2.obtenerPresupuesto());
    }
}
