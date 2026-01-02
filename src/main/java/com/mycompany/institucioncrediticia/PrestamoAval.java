/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;

import java.time.LocalDate;

public class PrestamoAval extends Prestamos {
    
    private String nomAval;
    private String aPaternoAval;
    private String aMaternoAval;
    private String direccAval;

    public PrestamoAval(Cliente cliente, String nomPrestamista, String aPaternoPtmista, String aMaternoPtmista,
                        TipoPrestamo tipoPrestamo, LocalDate fechaPrestamo, double tasaInteres,
                        double montoPrestamo, LocalDate fechaDesembolso, String nomAval, String aPaternoAval,
                        String aMaternoAval, String direccAval) {
        super(cliente, nomPrestamista, aPaternoPtmista, aMaternoPtmista, tipoPrestamo, fechaPrestamo,
                tasaInteres, montoPrestamo, fechaDesembolso);
        this.nomAval = nomAval;
        this.aPaternoAval = aPaternoAval;
        this.aMaternoAval = aMaternoAval;
        this.direccAval = direccAval;
    }

    public String getNomAval() {
        return nomAval;
    }

    public void setNomAval(String nomAval) {
        this.nomAval = nomAval;
    }

    public String getaPaternoAval() {
        return aPaternoAval;
    }

    public void setaPaternoAval(String aPaternoAval) {
        this.aPaternoAval = aPaternoAval;
    }

    public String getaMaternoAval() {
        return aMaternoAval;
    }

    public void setaMaternoAval(String aMaternoAval) {
        this.aMaternoAval = aMaternoAval;
    }

    public String getDireccAval() {
        return direccAval;
    }

    public void setDireccAval(String direccAval) {
        this.direccAval = direccAval;
    }
}

