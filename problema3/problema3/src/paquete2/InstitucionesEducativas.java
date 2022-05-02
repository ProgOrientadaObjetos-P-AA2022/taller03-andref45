/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author andreflores
 */
public class InstitucionesEducativas {

    private String nombre;
    private String t_ins;
    private int n_alum;
    private int n_doc;
    private int n_sedes;
    private double g_est;
    private double presupuesto;

    public void establecerNombre(String i) {
        nombre = i;
    }

    public void establecerT_ins(String i) {
        t_ins = i;
    }

    public void establecerN_alum(int i) {
        n_alum = i;
    }

    public void establecerN_doc(int i) {
        n_doc = i;
    }

    public void establecerN_sedes(int i) {
        n_sedes = i;
    }

    public void establecerG_est(double i) {
        g_est = i;
    }

    public void calcularPresupuesto() {
        presupuesto = n_alum * g_est;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerT_ins() {
        return t_ins;
    }

    public int obtenerN_alum() {
        return n_alum;
    }

    public int obtenerN_doc() {
        return n_doc;
    }

    public int obtenerN_sedes() {
        return n_sedes;
    }

    public double obtenerG_est() {
        return g_est;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
