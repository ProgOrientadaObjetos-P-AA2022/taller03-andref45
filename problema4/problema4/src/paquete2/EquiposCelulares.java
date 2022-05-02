/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author andreflores
 */
public class EquiposCelulares {

    private String s_o;
    private String t_p;
    private double c_ini;
    private double iva;
    private double iva_cIni;
    private double c_final;
    private String dir_mac;
    private String inf_IMEI;

    public void establecerS_O(String e) {
        s_o = e;
    }

    public void establecerT_P(String e) {
        t_p = e;
    }

    public void establecerC_ini(Double e) {
        c_ini = e;
    }

    public void establecerIva(Double e) {
        iva = e;
    }

    public void calcularIva_cIni() {
        iva_cIni = c_ini * (iva/100);
    }

    public void calcularC_final() {
        c_final = c_ini + iva_cIni;
    }

    public void establecerDir_Mac(String e) {
        dir_mac = e;
    }

    public void establecerInfIMEI(String e) {
        inf_IMEI = e;
    }

    public String obtenerS_O() {
        return s_o;
    }

    public String obtenerT_P() {
        return t_p;
    }

    public Double obtenerC_ini() {
        return c_ini;
    }

    public Double obtenerIva() {
        return iva;
    }

    public Double obtenerIva_cIni() {
        return iva_cIni;
    }

    public Double obtenerC_final() {
        return c_final;
    }

    public String obtenerDir_Mac() {
        return dir_mac;
    }

    public String obtenerInfIMEI() {
        return inf_IMEI;
    }
}
